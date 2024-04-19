package sushiBack.Service;

import java.util.List;

import sushiBack.Entity.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import sushiBack.Repo.CardRepo;

@Service
@RequiredArgsConstructor
public class CardService {
    @Autowired
    private CardRepo cardRepo;

    public List<Card> getCardAll(){
        
        return cardRepo.findAll();
    }

    public Object getCardById(int id){
        if(!cardRepo.existsById(id)){
            return new ResponseEntity<>("No such card with this id in database", HttpStatusCode.valueOf(400));
        }
        else return cardRepo.findById(id);
    }

    public ResponseEntity<String> createCard(Card card){
        cardRepo.saveAndFlush(card);
        return new ResponseEntity<>("Successfully added", HttpStatusCode.valueOf(400));
    }

    public Object deleteCard(int id){
        if(!cardRepo.existsById(id)){
            return new ResponseEntity<>("No such card with this id in database", HttpStatusCode.valueOf(400));
        }
        cardRepo.deleteById(id);
        return new ResponseEntity<>("Successfully deleted", HttpStatusCode.valueOf(400));
    }
    
}
