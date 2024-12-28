package org.example.guesthouse.auth.handler;

import com.amazonaws.services.s3.model.AmazonS3Exception;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.example.guesthouse.auth.exception.UserExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.SignatureException;
import java.util.concurrent.ExecutionException;

@RestControllerAdvice
@Slf4j
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

    @ExceptionHandler(ExecutionException.class)
    public ResponseEntity<ErrorResponse> ExecutionException(ExecutionException exception){
        return ResponseEntity.status(HttpStatus.LOCKED).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(InterruptedException.class)
    public ResponseEntity<ErrorResponse> InterruptedException(InterruptedException exception){
        return ResponseEntity.status(HttpStatus.LOCKED).body(ErrorResponse.from(exception.getMessage()));
    }

    @ExceptionHandler(AmazonS3Exception.class)
    protected ResponseEntity<org.springframework.web.ErrorResponse> AmazonS3Exception(AmazonS3Exception exception){
        log.error("AmazonS3Exception", exception);
        org.springframework.web.ErrorResponse response = org.springframework.web.ErrorResponse.create(exception, HttpStatusCode.valueOf(500), exception.getErrorResponseXml());
        return ResponseEntity.internalServerError().body(response);
    }


}
