package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseInfo;

@Builder
public record HousePosition (
String longtitude,
String latitude,
HouseInfo houseInfo
){
    public static HousePosition of(String longtitude, String latitude, HouseInfo houseInfo){
        return HousePosition.builder()
                .houseInfo(houseInfo)
                .latitude(latitude)
                .longtitude(longtitude)
                .build();
    }

}
