package sushiBack.Repo;

import sushiBack.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CardRepo extends JpaRepository<Card, Integer>{
    Optional<Card> findById(int id);
}
