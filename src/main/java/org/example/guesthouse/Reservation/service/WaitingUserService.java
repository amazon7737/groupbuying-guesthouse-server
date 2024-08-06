package org.example.guesthouse.Reservation.service;

import lombok.RequiredArgsConstructor;
import org.example.guesthouse.Reservation.infrastructure.WaitingUser;
import org.example.guesthouse.Reservation.infrastructure.WaitingUserDataRepository;
import org.example.guesthouse.user.infrastructure.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class WaitingUserService {

    private final WaitingUserDataRepository waitingUserDataRepository;

    public List<WaitingUser> findWaitingByUser(User user){
        List<WaitingUser> list = waitingUserDataRepository.findByUser(user);

//        if(list.isEmpty()){
//            throw new NoSuchElementException("대기중인 예약이 없습니다.");
//        }

        return list;
    }


}
