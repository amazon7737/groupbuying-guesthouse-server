package org.example.guesthouse.user.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

@Embeddable
@Getter
@NoArgsConstructor
public class Password {

    private static final String PASSWORD_REGEX =  "^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z[0-9]]{6,10}$";

    @Column(name = "password", nullable = false, unique = false)
    private String password;




}
