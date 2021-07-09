package kg.megacom.SchoolRegSystem.services.impl;

import kg.megacom.SchoolRegSystem.dao.OrderRepo;
import kg.megacom.SchoolRegSystem.mappers.OrderMapper;
import kg.megacom.SchoolRegSystem.mappers.SubscriberMapper;
import kg.megacom.SchoolRegSystem.models.dto.OrderDto;
import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;
import kg.megacom.SchoolRegSystem.models.entities.Order;
import kg.megacom.SchoolRegSystem.models.enums.OrderStatus;
import kg.megacom.SchoolRegSystem.services.OrderService;
import kg.megacom.SchoolRegSystem.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private SubscriberService subscriberService;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private SubscriberMapper subscriberMapper;
    @Override
    public OrderDto create(OrderDto orderDto) {
        Order order = new Order();
        orderDto.setSubscriberDto(subscriberService.getOrCreate(orderDto.getSubscriberDto()));
        order = orderMapper.toOrder(orderDto);
        order = orderRepo.save(order);
        return orderMapper.toOrderDto(order);
    }

    @Override
    public String checkTheOrder(SubscriberDto subscriberDto) {
        SubscriberDto subscriberDto1 = subscriberService.getOrCreate(subscriberDto);
//        subscriberDto1 = subscriberService.getOrCreate(subscriberDto);
        Order order = orderRepo.findBySubscriberAndEndDate(subscriberMapper.toSubscriber(subscriberDto1), null);

        if(order.getOrderStatus()== OrderStatus.APPROVED || order.getOrderStatus()== OrderStatus.DENIED){
            return "Ваша заявка принята!";
        }else if(order.getOrderStatus() == OrderStatus.PROCESSED){
            return "Ваша заявка на рассмотрении!";
        }
        return "";
    }
}
