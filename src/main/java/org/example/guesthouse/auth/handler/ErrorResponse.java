package org.example.guesthouse.auth.handler;

public record ErrorResponse (
        String message
){
    public static ErrorResponse from(String message){
        return new ErrorResponse(message);
    }
}
