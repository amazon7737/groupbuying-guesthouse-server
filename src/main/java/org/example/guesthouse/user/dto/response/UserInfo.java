package org.example.guesthouse.user.dto.response;

import lombok.Builder;
import org.example.guesthouse.Reservation.infrastructure.WaitingUser;
import org.example.guesthouse.user.infrastructure.User;

import java.util.List;

@Builder
public record UserInfo (
    String uuid,
    String username,
    String profileImage

//    List<WaitingUser> waiting

){


    public static UserInfo of(User user
//                              List<WaitingUser> waiting
    ){

        return UserInfo.builder()
                .profileImage(user.getProfileImage())
                .username(user.getUsername())
                .uuid(user.getUuid())
//                .waiting(waiting)
                .build();

    }

}
