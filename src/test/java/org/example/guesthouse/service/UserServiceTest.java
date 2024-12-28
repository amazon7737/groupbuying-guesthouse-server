package org.example.guesthouse.service;

import org.example.guesthouse.user.dto.request.SignupRequest;
import org.example.guesthouse.user.dto.response.UserInfo;
import org.example.guesthouse.user.infrastructure.User;
import org.example.guesthouse.user.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@SpringBootTest
public class UserServiceTest {

    @Autowired UserService userService;


    @Test
    @Transactional
    void signUp(){

        // given
        String username = "amazon7737";
        String password = "1234";
        String nickname = "아마존";

        // when
        userService.join(SignupRequest.of(username, password, nickname));
        UserInfo user = userService.get(username);

        // then
        Assertions.assertEquals(username, user.username());

    }



    @Test
    void login(){

    }

}
