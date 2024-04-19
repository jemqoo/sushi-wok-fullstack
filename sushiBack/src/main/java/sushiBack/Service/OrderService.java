package sushiBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import sushiBack.Repo.OrderRepo;
import sushiBack.Entity.Order;

@Service
@RequiredArgsConstructor
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    public List<Order> getOrderAll(){
        
        return orderRepo.findAll();
    }

    public Object getOrderById(int id){
        if(!orderRepo.existsById(id)){
            return new ResponseEntity<>("No such order with this id in database", HttpStatusCode.valueOf(400));
        }
        else return orderRepo.findById(id);
    }

    public ResponseEntity<String> createOrder(Order order){
        orderRepo.saveAndFlush(order);
        return new ResponseEntity<>("Successfully added", HttpStatusCode.valueOf(400));
    }

    public Object deleteOrder(int id){
        if(!orderRepo.existsById(id)){
            return new ResponseEntity<>("No such order with this id in database", HttpStatusCode.valueOf(400));
        }
        orderRepo.deleteById(id);
        return new ResponseEntity<>("Successfully deleted", HttpStatusCode.valueOf(400));
    }
    
}
