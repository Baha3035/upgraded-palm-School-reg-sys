package kg.megacom.SchoolRegSystem.models.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class SubscriberDto {
    private long id;
    private String name;
    private Date dateOfBirth;
    private String phone;
    private int age;
}
