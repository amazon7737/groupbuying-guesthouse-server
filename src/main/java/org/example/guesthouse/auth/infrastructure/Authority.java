package org.example.guesthouse.auth.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter
@Builder
@Table(name = "authority")
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    @Id
    @Column(nullable = false , length = 50, unique = false)
    private String authorityName;

}