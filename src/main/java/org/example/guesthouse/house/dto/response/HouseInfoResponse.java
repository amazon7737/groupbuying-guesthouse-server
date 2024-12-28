package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.house.infrastructure.House;

import java.util.List;

@Builder
public record HouseInfoResponse(
    Long id,
    String houseName,
    Long price,

    List<HouseImageResponse> houseImages

){


    public static HouseInfoResponse of (HouseInfoResponse houseInfo, List<HouseImage> houseImages ){
            return HouseInfoResponse.builder()
                    .id(houseInfo.id)
                    .houseName(houseInfo.houseName)
                    .price(houseInfo.price)
                    .houseImages(HouseImageResponse.toList(houseImages))
                    .build();
    }

    public static HouseInfoResponse from(House house){
        return HouseInfoResponse.builder()
                .id(house.getId())
                .houseName(house.getHouseName())
                .price(house.getPrice())
                .houseImages(null)
                .build();
    }




}
