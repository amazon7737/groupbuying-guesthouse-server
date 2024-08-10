package org.example.guesthouse.house.infrastructure;

import jakarta.persistence.*;
import lombok.*;
import org.example.guesthouse.auth.util.BaseEntity;
import org.example.guesthouse.user.infrastructure.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseInfo extends BaseEntity {


    @Column(nullable = false, unique = true)
    private String houseName;

    @Column(columnDefinition = "TEXT")
    private String houseDescription;

    @Column(nullable = false, unique = false)
    private Long price;

    @Column(nullable = false, unique = false)
    private String address;

//    @Column(nullable = false, unique = false)
//    private String captainImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @ToString.Exclude
    @OneToMany(mappedBy = "house", fetch = FetchType.LAZY)
    private List<HouseImage> houseImage = new ArrayList<>();

}
