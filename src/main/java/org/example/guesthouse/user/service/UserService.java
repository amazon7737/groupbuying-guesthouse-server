package org.example.guesthouse.user.service;

import lombok.RequiredArgsConstructor;
import org.example.guesthouse.Reservation.infrastructure.WaitingUser;
import org.example.guesthouse.Reservation.service.WaitingUserService;
import org.example.guesthouse.auth.exception.UserExistException;
import org.example.guesthouse.user.dto.request.SignupRequest;
import org.example.guesthouse.user.dto.response.UserInfo;
import org.example.guesthouse.user.infrastructure.User;
import org.example.guesthouse.user.infrastructure.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDataRepository userDataRepository;
    private final WaitingUserService waitingUserService;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Transactional(readOnly = true)
    public UserInfo get(String username){
        User user = userDataRepository.findUserByUsername(username)
                .orElseThrow(() -> new NoSuchElementException("해당 유저를 조회할 수 없습니다 :" + username));

//        List<WaitingUser> waiting = waitingUserService.findWaitingByUser(user);
        /**
         * 본인이 대기중인 예약도 보고 자기 정보도 보는거 조회하는 기능 만들다가 말음
         */
        return UserInfo.of(user
//                waiting
        );

    }

    @Transactional
    public void join(SignupRequest request){

        validateDuplicate(request.id());
        userDataRepository.save(User.toEntity(request.id(),
                true,
                UUID.randomUUID().toString(),
                passwordEncoder.encode(request.password()),
                "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380",
                request.nickname())).getUsername();
    }

    @Transactional(readOnly = true)
    public void validateDuplicate(String username){
        userDataRepository.findUserByUsername(username)
                .ifPresent(m -> {
                    throw new UserExistException("이미 존재하는 아이디입니다.");
                });
    }




}
