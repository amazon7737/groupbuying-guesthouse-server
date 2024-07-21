package org.example.guesthouse.auth.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityDataRepository extends JpaRepository<Authority, Long> {
}
