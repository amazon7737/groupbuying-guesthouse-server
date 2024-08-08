package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.house.infrastructure.HouseInfo;
import org.example.guesthouse.house.infrastructure.HousePosition;
import org.example.guesthouse.user.dto.response.UserInfo;
import org.example.guesthouse.user.infrastructure.User;

import java.util.ArrayList;
import java.util.List;

public record HouseInfoResponse(
    String houseName,
    String houseDescription,
    Long price,
    String address,

    UserInfo user,
    List<HouseImageResponse> houseImages,

    HousePositionResponse position
){


    public static HouseInfoResponse of (HouseInfo houseInfo, List<HouseImage> houseImage, HousePositionResponse position){
            return new HouseInfoResponse(
                    houseInfo.getHouseName(),
                    houseInfo.getHouseDescription(),
                    houseInfo.getPrice(),
                    houseInfo.getAddress(),
                    UserInfo.of(houseInfo.getUser()),
                    houseImage.stream().map(HouseImageResponse::from).toList(),
                    position
        );
    }


}
