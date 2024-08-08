package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseInfo;
import org.example.guesthouse.house.infrastructure.HousePosition;

@Builder
public record HousePositionResponse(
Double longtitude,
Double latitude

){
    public static HousePositionResponse of(Double longtitude, Double latitude){
        return HousePositionResponse.builder()
                .latitude(latitude)
                .longtitude(longtitude)
                .build();
    }

    public static HousePositionResponse from(HousePosition housePosition){
        return new HousePositionResponse(
               housePosition.getLatitude(),
               housePosition.getLongitude()
        );
    }

}
