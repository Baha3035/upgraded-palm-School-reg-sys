package kg.megacom.SchoolRegSystem.mappers.impl;

import kg.megacom.SchoolRegSystem.mappers.OrderMapper;
import kg.megacom.SchoolRegSystem.mappers.SubscriberMapper;
import kg.megacom.SchoolRegSystem.models.dto.OrderDto;
import kg.megacom.SchoolRegSystem.models.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMapperImpl implements OrderMapper {
    @Autowired
    private SubscriberMapper subscriberMapper;

    @Override
    public Order toOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setAddress(orderDto.getAddress());
        order.setSubscriber(subscriberMapper.toSubscriber(orderDto.getSubscriberDto()));
        order.setComment(orderDto.getComment());
        order.setSchoolName(orderDto.getSchool_name());
        order.setAddDate(orderDto.getAddDate());
        order.setEndDate(orderDto.getEndDate());
        order.setNaviDate(orderDto.getNaviDate());

        return order;
    }

    @Override
    public OrderDto toOrderDto(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setAddress(order.getAddress());
        orderDto.setSubscriberDto(subscriberMapper.toSubscriberDto(order.getSubscriber()));
        orderDto.setComment(order.getComment());
        orderDto.setSchool_name(order.getSchoolName());
        orderDto.setAddDate(order.getAddDate());
        orderDto.setEndDate(order.getEndDate());
        orderDto.setNaviDate(order.getNaviDate());
        return orderDto;
    }
}
