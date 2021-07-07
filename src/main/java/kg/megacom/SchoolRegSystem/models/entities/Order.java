package kg.megacom.SchoolRegSystem.models.entities;

import kg.megacom.SchoolRegSystem.models.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String school_name;
    private String address;
    private Date add_date;
    private Date end_date;
    private Date navi_date;
    private String comment;
    @ManyToOne
    private Subscriber subscriber;

    private OrderStatus order_status;
}
