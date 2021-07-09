package kg.megacom.SchoolRegSystem.controllers;

import kg.megacom.SchoolRegSystem.models.dto.OrderDto;
import kg.megacom.SchoolRegSystem.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public OrderDto createOrder(@RequestBody OrderDto orderDto){
        return orderService.create(orderDto);
    }
}
