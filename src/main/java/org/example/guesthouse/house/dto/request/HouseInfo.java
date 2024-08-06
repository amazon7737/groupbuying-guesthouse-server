package org.example.guesthouse.house.dto.request;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseImage;
import org.example.guesthouse.user.infrastructure.User;

import java.util.List;

@Builder
public record HouseInfo (
    String houseName,
    String houseDescription,
    Long price,
    String captainImage,

    User user,

    List<HouseImage> houseImages


){

    public HouseInfo toEntity(HouseInfo houseInfo){
        return HouseInfo.builder()
                .houseImages(houseInfo.houseImages)
                .captainImage(houseInfo.captainImage)
                .houseName(houseInfo.houseName)
                .houseDescription(houseInfo.houseDescription)
                .price(houseInfo.price)
                .user(houseInfo.user)
                .build();
    }
}
