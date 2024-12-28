package org.example.guesthouse.Reservation.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.guesthouse.auth.util.BaseEntity;
import org.example.guesthouse.house.infrastructure.House;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private House house;

    @Column(nullable = false, unique = false)
    private Long price;

    @Column(nullable = false)
    private Boolean reservated;

    @Column(nullable = false, unique = false)
    private String lastDate;

    @Column(nullable = false, unique = false)
    private String startDate;

    @ToString.Exclude
    @OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
    List<WaitingUser> waitingUsers = new ArrayList<>();


}
