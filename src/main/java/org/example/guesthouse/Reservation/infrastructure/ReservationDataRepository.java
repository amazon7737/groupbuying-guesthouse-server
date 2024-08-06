package org.example.guesthouse.Reservation.infrastructure;

import org.example.guesthouse.user.infrastructure.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationDataRepository extends JpaRepository<Reservation, Long> {

    Optional<Reservation> findReservationByWaitingUsers(User user);


}
