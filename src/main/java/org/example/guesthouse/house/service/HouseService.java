package org.example.guesthouse.house.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;
import org.example.guesthouse.house.infrastructure.*;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class HouseService {

    private final HouseInfoDataRepository houseInfoDataRepository;
    private final HouseImageDataRepository houseImageDataRepository;

    List<List<HouseImage>> houseImageList = new ArrayList<>();

    @Transactional(readOnly = true)
    public HouseInfo findByHouse(Long houseId){
        return houseInfoDataRepository.findById(houseId).orElseThrow(() -> new NoSuchElementException("해당 하우스가 존재하지 않습니다."));
    }


    // v1
    @Transactional(readOnly = true)
    public List<HouseInfoResponse> findHouseInfoAndImagesAndPositionAll(){

        List<HouseInfo> houseInfoList = houseInfoDataRepository.findAll();
        List<HouseInfoResponse> result = new ArrayList<>();

        for(int i=0; i< houseInfoList.size(); i++){

            List<HouseImage> imageList = houseImageDataRepository.findAllByHouse(houseInfoList.get(i));
            result.add(HouseInfoResponse.of(HouseInfoResponse.from(houseInfoList.get(i)), imageList ));
        }

        return result;

    }

    @Transactional(readOnly = true)
    public List<HouseInfo> findAll(){
        List<HouseInfo> result = houseInfoDataRepository.findAll();
        return result;
    }

    @Transactional(readOnly = true)
    public List<HouseInfo> findAll(Pageable pageable){
        return houseInfoDataRepository.findAll(pageable).getContent();
    }


    // 사용안하고있음
    @Transactional(readOnly = true)
    public CompletableFuture<List<HouseImage>> setData(HouseInfo houseInfo) throws InterruptedException, ExecutionException {
        List<List<HouseImage>> houseImageList = new ArrayList<>();

        log.info("===== ImageSearch Start ====");

        CompletableFuture result = CompletableFuture.completedFuture(houseImageDataRepository.findAllByHouse(houseInfo));
        houseImageList.add((List<HouseImage>) result.get());
        log.info("===== ImageSearch End ====");
        return result;
    }

    // 비동기 방식 v2
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    @Async("threadPoolTaskExecutor")
    public void setDataV2(HouseInfo houseInfo) {

        log.info("===== ImageSearch Start ====");

        List<HouseImage> result = houseImageDataRepository.findAllByHouse(houseInfo);
        houseImageList.add(result);

        log.info("===== ImageSearch End ====");

    }

    // v2 구형버전
    @Transactional(readOnly = true)
    public HouseInfoResponse[] findByHouseInfoV2() {

        List<List<HouseImage>> houseImageList = new ArrayList<>();
        List<CompletableFuture> futureList = new ArrayList<>();
        List<HouseInfo> houseInfoList = findAll();
        HouseInfoResponse[] result = new HouseInfoResponse[houseInfoList.size()];
        for(int i=0; i< houseInfoList.size();i++){
        CompletableFuture<List<HouseImage>> futures = new CompletableFuture<>();
            int finalI1 = i;
            futures.thenAccept(s -> {
                try {
                    houseImageList.add(futures.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
                for(int j =0; j<houseImageList.size(); j++){
                    result[finalI1] = HouseInfoResponse.of(HouseInfoResponse.from(houseInfoList.get(finalI1)), houseImageList.get(j));
                }
            });
                        log.info("========== 111 =========== ");
            int finalI = i;
            Executors.newCachedThreadPool().submit(() -> {
                    try{
                        log.info("======= method start ======");
                        futures.complete(setData(houseInfoList.get(finalI)).get());
                        log.info("======== method end ======== ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                });
        }
        log.info("========== 333 =========== ");
        return result;

    }

    /**
     *
     *
     */

    // 하우스 정보 찾아오고 이미지 찾으러 와라고 던져주는 상위 메소드
    @Transactional(readOnly = true)
    public HouseInfoResponse[] findHouseInfo(Pageable pageable) throws InterruptedException, ExecutionException, TimeoutException {
        List<HouseInfo> houseInfoList = findAll(pageable);
        return findByHouseImage(pageable, houseInfoList);
    }

    // 끝에만 동기 쓰레드 다중 생성에는 비동기로 처리 하면 첫번째 쓰레드를 기다리지않고 비동기 처리로 다음 쓰레드가 출발
    @Transactional(readOnly = true)
    public HouseInfoResponse[] findByHouseImage(Pageable pageable, List<HouseInfo> houseInfoList) throws ExecutionException, InterruptedException, TimeoutException {
        // 쓰레드들만 동시에 개수만큼 선언하면서 쿼리 날아가도록 하고
        // 데이터 들어오는거 기다리는거 만들면
        HouseInfoResponse[] result = new HouseInfoResponse[houseInfoList.size()];
        List<List<HouseImage>> list = new ArrayList<>();

        log.info("작업시작 ===");
        // 이거 호출할때 쓰레드 시작 시키는 작업이 되자마자 바로 완료되어서 로직이 흘러가버림
            CompletableFuture<List<List<HouseImage>>> future = getHouseImages(houseInfoList);
            Thread.sleep(1000L);
            future.get();

        log.info("작업 끝 ===");

        return MergeHouseInfoAndImages(houseInfoList.size(), houseInfoList, houseImageList);
    }


    @Transactional(readOnly = true)
    public CompletableFuture<List<List<HouseImage>>> getHouseImages(List<HouseInfo> houseInfoList)  {
        for(int i=0; i< houseInfoList.size(); i++) {
            int index = i;
            Executors.newCachedThreadPool().submit(() -> {
                    setDataV2(houseInfoList.get(index));
            });
        }
        return CompletableFuture.completedFuture(houseImageList);
    }

    @Transactional(readOnly = true)
    public HouseInfoResponse[] MergeHouseInfoAndImages(int size, List<HouseInfo> houseInfoList, List<List<HouseImage>> houseImageList) {
        HouseInfoResponse[] result = new HouseInfoResponse[size];

        for(int i=0; i< size; i++){
            log.info("??", houseImageList.get(0));
            result[i]= HouseInfoResponse.of(HouseInfoResponse.from(houseInfoList.get(i)), houseImageList.get(i));
        }
        return result;
    }

}
