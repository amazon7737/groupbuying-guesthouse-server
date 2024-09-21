package org.example.guesthouse.house.infrastructure;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseInfoDataRepository extends JpaRepository<HouseInfo, Long> {


    @Query("select m from HouseInfo m join fetch m.user")
    Page<HouseInfo> findAll(Pageable pageable);


}
