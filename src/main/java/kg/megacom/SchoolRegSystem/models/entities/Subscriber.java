package kg.megacom.SchoolRegSystem.models.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "subscribers")
@Data
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Column(name = "date_of_birth")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    private String phone;
    private int age;
}
