package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseInfo;

@Builder
public record HouseImage (
    String url,
    HouseInfo houseInfo
){

    public static HouseImage of(String url, HouseInfo houseInfo){
        return HouseImage.builder()
                .houseInfo(houseInfo)
                .url(url)
                .build();
    }

}
