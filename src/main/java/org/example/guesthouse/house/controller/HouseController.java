package org.example.guesthouse.house.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;
import org.example.guesthouse.house.service.HouseService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController
@RequiredArgsConstructor
@Tag(name = "게스트하우스 정보 api")
@RequestMapping("/api")
public class HouseController {

    private final HouseService houseService;

    @GetMapping("/v1/house")
    @Operation(summary = "비동기 논블록킹 병렬 전체 조회 https://{domain}/house/v2?page=0&size=8, page와 size를 param으로 주시면 그만큼 응답해드립니다. 마지막 로드일경우 빈배열이 등장합니다.")
    public ResponseEntity<HouseInfoResponse[]> findAll(@PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable) throws ExecutionException, InterruptedException, TimeoutException {
        HouseInfoResponse[] list = houseService.findHouseInfo(pageable);
        return ResponseEntity.status(HttpStatus.OK).body(
                list
        );
    }

    @GetMapping("/v2/house")
    @Operation(summary = "cardId 값을 받아 해당 하우스 정보를 조회한다. ex) header {cardId : 1}")
    public ResponseEntity<HouseInfoResponse> houseV2(@RequestHeader("cardId") Long id) throws ExecutionException, InterruptedException {
        HouseInfoResponse list = houseService.get(id);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/v3/house")
    @Operation(summary = "cardId 값을 받아 해당 하우스 정보를 조회한다. ex) header {cardId : 1}")
    public ResponseEntity<HouseInfoResponse> houseV3(@RequestParam("cardId") Long id) throws ExecutionException, InterruptedException {
        HouseInfoResponse list = houseService.get(id);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }






    // 하우스 등록하기

    // 하우스 수정

    // 가계 폐점 -> 완전 폐점 기한

    // 예약 문의 조회

    // 예약 문의 답변달기



}
