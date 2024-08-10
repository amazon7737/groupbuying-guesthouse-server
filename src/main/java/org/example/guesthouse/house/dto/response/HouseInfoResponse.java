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
    Long price,

    List<HouseImageResponse> houseImages

){


    public static HouseInfoResponse of (HouseInfo houseInfo, List<HouseImage> houseImage ){
            return new HouseInfoResponse(
                    houseInfo.getHouseName(),
                    houseInfo.getPrice(),
                    houseImage.stream().map(HouseImageResponse::from).toList()
        );
    }


}
