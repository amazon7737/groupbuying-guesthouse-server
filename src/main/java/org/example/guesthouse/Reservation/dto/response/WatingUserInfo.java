package org.example.guesthouse.Reservation.dto.response;

import lombok.Builder;
import org.example.guesthouse.Reservation.infrastructure.Reservation;
import org.example.guesthouse.user.infrastructure.User;

@Builder
public record WatingUserInfo(

        Reservation reservation,
        User user


) {

    public static WatingUserInfo of(Reservation reservation, User user){
        return WatingUserInfo.builder()
                .user(user)
                .reservation(reservation)
                .build();
    }


}
