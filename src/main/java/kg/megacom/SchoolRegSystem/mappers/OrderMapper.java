package kg.megacom.SchoolRegSystem.mappers;

import kg.megacom.SchoolRegSystem.models.dto.OrderDto;
import kg.megacom.SchoolRegSystem.models.entities.Order;

public interface OrderMapper {
    Order toOrder(OrderDto orderDto);
    OrderDto toOrderDto(Order order);
}
