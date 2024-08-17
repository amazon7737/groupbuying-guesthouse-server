package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.house.infrastructure.HouseInfo;
import org.example.guesthouse.house.infrastructure.HousePosition;
import org.example.guesthouse.user.dto.response.UserInfo;
import org.example.guesthouse.user.infrastructure.User;

import java.util.ArrayList;
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

    public static HouseInfoResponse from(HouseInfo houseInfo){
        return HouseInfoResponse.builder()
                .id(houseInfo.getId())
                .houseName(houseInfo.getHouseName())
                .price(houseInfo.getPrice())
                .houseImages(null)
                .build();
    }



}
