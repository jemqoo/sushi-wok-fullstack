package sushiBack.Entity;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Component
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String payment;
    String email;
    String phone;
    String address;
    int total;
    List<Integer> items;
}
