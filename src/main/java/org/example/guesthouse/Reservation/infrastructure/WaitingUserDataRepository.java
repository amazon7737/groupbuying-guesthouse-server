package org.example.guesthouse.Reservation.infrastructure;

import org.example.guesthouse.user.infrastructure.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WaitingUserDataRepository extends JpaRepository<WaitingUser, Long> {

    List<WaitingUser> findByUser(User user);

}
