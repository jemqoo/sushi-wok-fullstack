package sushiBack.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import sushiBack.Entity.Card;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardsCountAll {
    private int total;
    private List<Card> items;
    
}
