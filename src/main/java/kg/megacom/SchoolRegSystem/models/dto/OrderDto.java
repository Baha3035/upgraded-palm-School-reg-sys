package kg.megacom.SchoolRegSystem.models.dto;

import kg.megacom.SchoolRegSystem.models.entities.Subscriber;
import kg.megacom.SchoolRegSystem.models.enums.OrderStatus;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.util.Date;
@Data
public class OrderDto {
        private long id;
        private String school_name;
        private String address;
        private Date addDate;
        private Date endDate;
        private Date naviDate;
        private String comment;
        private SubscriberDto subscriberDto;
        private OrderStatus orderStatus;
}
