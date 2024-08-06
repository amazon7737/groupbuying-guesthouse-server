package org.example.guesthouse.user.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import jakarta.validation.Valid;
import org.example.guesthouse.auth.jwt.JwtFilter;
import org.example.guesthouse.auth.jwt.TokenProvider;
import org.example.guesthouse.user.dto.request.LoginRequest;
import org.example.guesthouse.user.dto.request.SignupRequest;
import org.example.guesthouse.user.dto.response.LoginResponse;
import org.example.guesthouse.user.dto.response.UserInfo;
import org.example.guesthouse.user.service.UserService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final TokenProvider tokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authorize(@Valid @RequestBody LoginRequest request){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(request.id(), request.password());
        log.info("auth:{}", authenticationToken.getCredentials());
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        log.info("user:{}", authentication);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + token);

        return new ResponseEntity<>(new LoginResponse(token), httpHeaders, HttpStatus.OK);

    }
    // -> 추후 연동 로그인으로 수정


    // 회원가입?
    @PostMapping("/join")
    public ResponseEntity<HttpStatus> join(@Valid @RequestBody SignupRequest request){
        userService.join(request);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    // 회원 정보 수정


    // 회원 탈퇴 -> 완전 탈퇴 기한

    @GetMapping("/get")
    public ResponseEntity<UserInfo> get(@RequestHeader("Authorization") String token){
//        userService.get()
        String username = tokenProvider.getUserFromToken(token);
        UserInfo response = userService.get(username);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
