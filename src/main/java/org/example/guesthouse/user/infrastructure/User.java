package org.example.guesthouse.user.infrastructure;

import jakarta.persistence.*;
import lombok.*;
import org.example.guesthouse.auth.infrastructure.Authority;
import org.example.guesthouse.auth.util.BaseEntity;

import java.util.Set;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(nullable = false, unique = true)
    private String uuid;

    @Embedded
    private Password password;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = false)
    private boolean activated;


    @ManyToMany
    @JoinTable(
            name = "userAuthority",
            joinColumns = {@JoinColumn(name = "uuid", referencedColumnName = "uuid")},
            inverseJoinColumns = {@JoinColumn(name = "authorityName", referencedColumnName = "authorityName")}
    )
    private Set<Authority> authorities;

}
