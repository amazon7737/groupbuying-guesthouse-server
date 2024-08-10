package org.example.guesthouse.house.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;
import org.example.guesthouse.house.infrastructure.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class HouseService {

    private final HouseInfoDataRepository houseInfoDataRepository;
    private final HouseImageDataRepository houseImageDataRepository;


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




    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    @Async("threadPoolTaskExecutor")
    public CompletableFuture<List<HouseImage>> setDataV2(HouseInfo houseInfo)  {

        log.info("========== async start {}=========== ", houseInfo.getHouseName());
//        Thread.sleep(4000);

        CompletableFuture result =  CompletableFuture.completedFuture(houseImageDataRepository.findAllByHouse(houseInfo));

        log.info("========== async end {}=========== ", houseInfo.getHouseName());

        return result;

    }


    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    @Async("threadPoolTaskExecutor")
    public Future<List<HouseImage>> setDataV3(HouseInfo houseInfo){
        log.info("========== async start {}=========== ", houseInfo.getHouseName());
        Future result = new AsyncResult(houseImageDataRepository.findAllByHouse(houseInfo));
        log.info("========== async end {}=========== ", houseInfo.getHouseName());

        return result;

    }


    @Transactional(readOnly = true)
    public HouseInfoResponse[] findByHouseInfoV2() throws ExecutionException, InterruptedException {

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
                        futures.complete(setDataV2(houseInfoList.get(finalI)).get());
                        log.info("======== method end ======== ");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }

                });

        }


        CompletableFuture<Void> allOf = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0]));
        allOf.join();

        log.info("========== 333 =========== ");

        return result;

    }
}
