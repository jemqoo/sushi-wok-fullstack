package sushiBack.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Component
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String description;
    String image;
    String title;
    String category;
    int price;
}
