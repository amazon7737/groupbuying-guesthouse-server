package org.example.guesthouse.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {


    private String id;
    private String password;


}
