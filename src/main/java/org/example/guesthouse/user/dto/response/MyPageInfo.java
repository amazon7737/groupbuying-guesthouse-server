package org.example.guesthouse.user.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.dto.response.HouseInfoResponse;

import java.util.List;

@Builder
public record MyPageInfo (
        String profileImage,
        String username,

        List<HouseInfoResponse> houses
){


    public static MyPageInfo of(String profileImage, String username, List<HouseInfoResponse> houses){

        return new MyPageInfo(
                profileImage,
                username,
                houses
        );


    }


}
