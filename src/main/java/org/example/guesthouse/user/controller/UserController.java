package org.example.guesthouse.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import jakarta.validation.Valid;
import org.example.guesthouse.auth.jwt.JwtFilter;
import org.example.guesthouse.auth.jwt.TokenProvider;
import org.example.guesthouse.user.dto.request.LoginRequest;
import org.example.guesthouse.user.dto.request.SignupRequest;
import org.example.guesthouse.user.dto.response.LoginResponse;
import org.example.guesthouse.user.dto.response.SignupResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final TokenProvider tokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authorize(@Valid @RequestBody LoginRequest request){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(request.getId(), request.getPassword());
        log.info("auth:{}", authenticationToken.getCredentials());
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        log.info("user:{}", authentication);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + token);

        return new ResponseEntity<>(new LoginResponse(token), httpHeaders, HttpStatus.OK);

    }



//    @PostMapping("/signup")
//    public ResponseEntity<SignupResponse> signUp(@Valid @RequestBody SignupRequest request){
//
//    }

}
