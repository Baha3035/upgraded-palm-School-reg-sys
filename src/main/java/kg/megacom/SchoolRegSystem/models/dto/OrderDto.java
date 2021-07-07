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
        private Date add_date;
        private Date end_date;
        private Date navi_date;
        private String comment;
        private Subscriber subscriber;
        private OrderStatus order_status;
}
