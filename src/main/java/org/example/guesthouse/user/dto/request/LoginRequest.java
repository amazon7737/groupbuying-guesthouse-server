package org.example.guesthouse.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

public record LoginRequest (

         String id,
         String password

){



}
