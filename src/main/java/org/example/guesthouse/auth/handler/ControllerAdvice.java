package org.example.guesthouse.auth.handler;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.apache.coyote.Response;
import org.example.guesthouse.auth.exception.UserExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.SignatureException;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(UserExistException.class)
    public ResponseEntity<ErrorResponse> UserExistException(UserExistException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(e.getMessage()));
    }


//    public ResponseEntity<ErrorResponse> NotEnoughException(){
//
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> MethodArgumentNotValidException(MethodArgumentNotValidException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(e.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> IllegalArgumentException(IllegalArgumentException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(SecurityException.class)
    public ResponseEntity<ErrorResponse> SecurityException(SecurityException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(MalformedJwtException.class)
    public ResponseEntity<ErrorResponse> MalformedJwtException(MalformedJwtException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(ExpiredJwtException.class)
    public ResponseEntity<ErrorResponse> ExpiredJwtException(ExpiredJwtException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(UnsupportedJwtException.class)
    public ResponseEntity<ErrorResponse> UnsupportedJwtException(UnsupportedJwtException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
    }

//    @ExceptionHandler(SignatureException.class)
//    public ResponseEntity<ErrorResponse> SignatureException(SignatureException exception){
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponse.from(exception.getMessage()));
//    }



}
