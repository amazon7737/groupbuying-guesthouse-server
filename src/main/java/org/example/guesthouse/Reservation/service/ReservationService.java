package org.example.guesthouse.Reservation.service;

import lombok.RequiredArgsConstructor;
import org.example.guesthouse.Reservation.infrastructure.Reservation;
import org.example.guesthouse.Reservation.infrastructure.ReservationDataRepository;
import org.example.guesthouse.user.infrastructure.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationDataRepository reservationDataRepository;

    public Reservation findReservationByUser(User user){
        return reservationDataRepository.findReservationByWaitingUsers(user).orElseThrow(() -> new NoSuchElementException("예약한 하우스가 없습니다."));
    }


}
