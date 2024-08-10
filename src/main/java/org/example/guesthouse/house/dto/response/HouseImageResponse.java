package org.example.guesthouse.house.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.house.infrastructure.HouseInfo;

import java.util.ArrayList;
import java.util.List;

@Builder
public record HouseImageResponse(
    String url
){

    public static HouseImageResponse of(String url, HouseInfo houseInfo){
        return HouseImageResponse.builder()
                .url(url)
                .build();
    }

    public static HouseImageResponse from(HouseImage houseImage){
        return new HouseImageResponse(
                houseImage.getUrl()
        );
    }

    public static List<HouseImageResponse> toList(List<HouseImage> houseImages){
        List<HouseImageResponse> list = new ArrayList<>();
        for(HouseImage houseImage : houseImages){
            list.add(from(houseImage));
        }

        return list;

    }

}
