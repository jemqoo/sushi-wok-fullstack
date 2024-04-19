package sushiBack.Repo;

import sushiBack.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface OrderRepo extends JpaRepository<Order, Integer>{
    Optional<Order> findById(int id);
}
