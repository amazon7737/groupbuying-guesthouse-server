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
public class HouseImage extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private House house;


}
