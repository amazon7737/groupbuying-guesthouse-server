package org.example.guesthouse.house.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.guesthouse.auth.util.BaseEntity;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HousePosition extends BaseEntity {

    @Column(nullable = false, unique = false)
    private String latitude;

    @Column(nullable = false,unique = false)
    private String longtitude;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private HouseInfo houseId;



}
