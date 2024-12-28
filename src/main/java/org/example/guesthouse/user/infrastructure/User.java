package org.example.guesthouse.user.infrastructure;

import jakarta.persistence.*;
import lombok.*;
import org.example.guesthouse.auth.infrastructure.Authority;
import org.example.guesthouse.house.infrastructure.House;

import java.util.ArrayList;
import java.util.List;
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

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = true, unique = false)
    private String profileImage;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, unique = false)
    private boolean activated;


    @ManyToMany
    @JoinTable(
            name = "userAuthority",
            joinColumns = {@JoinColumn(name = "uuid", referencedColumnName = "uuid")},
            inverseJoinColumns = {@JoinColumn(name = "authorityName", referencedColumnName = "authorityName")}
    )
    private Set<Authority> authorities;

    @ToString.Exclude
    @OneToMany(mappedBy = "houseName", fetch = FetchType.LAZY)
    private List<House> house = new ArrayList<>();


    public static User toEntity(String username , boolean activated, String uuid, String password, String profileImage, String nickname){
        return User.builder()
                .username(username)
                .activated(activated)
                .password(password)
                .profileImage(profileImage)
                .uuid(uuid)
                .nickname(nickname)
                .build();
    }


}
