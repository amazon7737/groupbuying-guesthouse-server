package org.example.guesthouse.house.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.guesthouse.auth.util.BaseEntity;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HousePosition extends BaseEntity {

    @Column(nullable = false, unique = false)
    private Double latitude;

    @Column(nullable = false,unique = false)
    private Double longitude;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private House houseId;



}
