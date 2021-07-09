package kg.megacom.SchoolRegSystem.models.entities;

import kg.megacom.SchoolRegSystem.models.enums.OrderStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "school_name")
    private String schoolName;
    private String address;
    @Column(name = "add_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date addDate;
    @Column(name = "end_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "navi_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date naviDate;
    private String comment;
    @ManyToOne
    private Subscriber subscriber;
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrderStatus orderStatus;
}
