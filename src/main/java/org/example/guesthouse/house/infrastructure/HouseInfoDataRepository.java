package org.example.guesthouse.house.infrastructure;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface HouseInfoDataRepository extends JpaRepository<House, Long> {


    @Query("select m from House m join fetch m.user")
    Page<House> findAll(Pageable pageable);


}
