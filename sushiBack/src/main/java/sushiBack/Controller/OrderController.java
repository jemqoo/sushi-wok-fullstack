package sushiBack.Controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import sushiBack.Entity.Order;
import sushiBack.Service.OrderService;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders(){
        return orderService.getOrderAll();
    }

    @GetMapping("/{id}")
    public Object getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/new")
    public HttpStatusCode createOrder(@RequestBody Order order){
        System.out.println(order.toString());
        orderService.createOrder(order);
        return HttpStatusCode.valueOf(202);
    }

    @DeleteMapping("/del/{id}")
    public Object deleteOrder(@PathVariable int id){
        return orderService.deleteOrder(id);
    }
}
