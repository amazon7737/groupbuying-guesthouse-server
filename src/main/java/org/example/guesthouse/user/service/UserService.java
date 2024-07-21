package org.example.guesthouse.user.service;

import lombok.RequiredArgsConstructor;
import org.example.guesthouse.user.dto.request.SignupRequest;
import org.example.guesthouse.user.dto.response.SignupResponse;
import org.example.guesthouse.user.infrastructure.UserDataRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDataRepository userDataRepository;


//    public SignupResponse signup(SignupRequest request){
//
//    }
//
//
//    private void validateUser(){
//
//    }

}
