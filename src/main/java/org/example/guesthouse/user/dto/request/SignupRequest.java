package org.example.guesthouse.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record SignupRequest (
    @NotBlank(message = "아이디를 입력해주세요")
    String id,

    @NotBlank(message = "비밀번호를 입력해주세요")
    @Pattern(message =  "패스워드 패턴이 맞지 않습니다" , regexp = "^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z[0-9]]{6,10}$" )
    String password,

    String nickname
){


    public static SignupRequest of(String id,
                                   String password,
                                   String nickname){
        return new SignupRequest(id,
                password,
                nickname);
    }

}
