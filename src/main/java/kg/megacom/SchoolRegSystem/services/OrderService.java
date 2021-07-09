package kg.megacom.SchoolRegSystem.services;

import kg.megacom.SchoolRegSystem.models.dto.OrderDto;
import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;

public interface OrderService {
    OrderDto create(OrderDto orderDto);

    String checkTheOrder(SubscriberDto subscriberDto);
}