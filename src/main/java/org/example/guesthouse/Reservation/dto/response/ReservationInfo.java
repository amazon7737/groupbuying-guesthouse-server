package org.example.guesthouse.Reservation.dto.response;

import lombok.Builder;
import org.example.guesthouse.house.infrastructure.HouseInfo;

@Builder
public record ReservationInfo (

    HouseInfo houseInfo,
    Long price,
    Boolean reservated,
    String lastDate,
    String startDate
){

    public static ReservationInfo of(HouseInfo houseInfo, Long price, Boolean reservated, String lastDate, String startDate){
        return ReservationInfo.builder()
                .reservated(reservated)
                .houseInfo(houseInfo)
                .lastDate(lastDate)
                .startDate(startDate)
                .price(price)
                .build();
    }

}
