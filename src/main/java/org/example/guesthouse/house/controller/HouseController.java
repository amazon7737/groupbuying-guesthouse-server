package org.example.guesthouse.house.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.guesthouse.house.dto.response.HouseImageResponse;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.house.infrastructure.HouseInfo;
import org.example.guesthouse.house.service.HouseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequiredArgsConstructor
public class HouseController {

    private final HouseService houseService;

    @GetMapping("/house")
    public ResponseEntity<List<HouseInfoResponse>> findHouseAll(){
        List<HouseInfoResponse> list = houseService.findHouseInfoAndImagesAndPositionAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }

    @GetMapping("/house/v2")
    public ResponseEntity<HouseInfoResponse[]> findHouseAllWithAsync() throws ExecutionException, InterruptedException {
        HouseInfoResponse[] list = houseService.findByHouseInfoV2();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }


    // 하우스 등록하기

    // 하우스 수정

    // 가계 폐점 -> 완전 폐점 기한

    // 예약 문의 조회

    // 예약 문의 답변달기



}
