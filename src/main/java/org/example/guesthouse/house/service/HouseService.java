package org.example.guesthouse.house.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;
import org.example.guesthouse.house.infrastructure.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

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
            result.add(HouseInfoResponse.of(houseInfoList.get(i), imageList ));
        }

        return result;

    }

    @Transactional(readOnly = true)
    public List<HouseInfo> findAll(){
        List<HouseInfo> result = houseInfoDataRepository.findAll();
        return result;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    @Async
    public List<HouseImage> setDataV2(HouseInfo houseInfo){

        log.info("========== get Data {}=========== ", houseInfo.getId());


        return houseImageDataRepository.findAllByHouse(houseInfo);

    }


    @Transactional
    public List<HouseInfoResponse> findByHouseInfoV2() throws ExecutionException, InterruptedException {
        List<HouseInfoResponse> result = new ArrayList<>();

        List<List<HouseImage>> houseImageList = new ArrayList<>();

        CompletableFuture<List<HouseImage>> future = new CompletableFuture<>();

        List<HouseInfo> houseInfoList = findAll();

        log.info("========== async start =========== ");

        for(int i=0; i< houseInfoList.size();i++){

            int finalI = i;

            Executors.newCachedThreadPool().submit(() -> {

                log.info("========== 쓰레드온 =========== {}", houseInfoList.get(finalI));

            future.complete(setDataV2(houseInfoList.get(finalI)));
        });


        houseImageList.add(future.get());

        }

        log.info("========== async end =========== ");

        for(int i=0; i< houseInfoList.size(); i++){
            result.add(HouseInfoResponse.of(houseInfoList.get(i), houseImageList.get(i)));
        }

        return result;

    }



}
