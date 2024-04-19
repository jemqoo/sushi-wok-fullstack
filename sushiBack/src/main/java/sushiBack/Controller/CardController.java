package sushiBack.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import sushiBack.DTO.CardsCountAll;
import sushiBack.Entity.Card;
import sushiBack.Service.CardService;

@RestController
@RequestMapping("/card")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping("/all")
    public List<Card> getAllCards(){
        return cardService.getCardAll();
    }

    @GetMapping("/{id}")
    public Object getCardById(@PathVariable int id){
        return cardService.getCardById(id);
    }

    @PostMapping("/new")
    public ResponseEntity<String> createCard(@RequestBody Card card){
        System.out.println(card.toString());
        return cardService.createCard(card);
    }

    @DeleteMapping("/del/{id}")
    public Object deleteCard(@PathVariable int id){
        return cardService.deleteCard(id);
    }

    @GetMapping("/allCount")
    public CardsCountAll getCountCards(){
        List<Card> temp = cardService.getCardAll();
        return new CardsCountAll(temp.size(), temp);
    }
}
