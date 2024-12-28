package org.example.guesthouse.Reservation.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.House;

@Builder
public record ReservationInfo (

    House house,
    Long price,
    Boolean reservated,
    String lastDate,
    String startDate
){

    public static ReservationInfo of(House house, Long price, Boolean reservated, String lastDate, String startDate){
        return ReservationInfo.builder()
                .reservated(reservated)
                .house(house)
                .lastDate(lastDate)
                .startDate(startDate)
                .price(price)
                .build();
    }

}
