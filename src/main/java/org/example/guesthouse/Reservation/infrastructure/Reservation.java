package org.example.guesthouse.Reservation.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.guesthouse.auth.util.BaseEntity;
import org.example.guesthouse.house.infrastructure.HouseInfo;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private HouseInfo house;

    @Column(nullable = false, unique = false)
    private Long price;

    @Column(nullable = false)
    private Boolean reservated;

    @Column(nullable = false, unique = false)
    private String lastDate;

    @Column(nullable = false, unique = false)
    private String startDate;


}
