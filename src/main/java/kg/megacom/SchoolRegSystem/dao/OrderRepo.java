package kg.megacom.SchoolRegSystem.dao;

import kg.megacom.SchoolRegSystem.models.entities.Order;
import kg.megacom.SchoolRegSystem.models.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    Order findBySubscriberAndEndDate(Subscriber subscriber, Date endDate);
}
