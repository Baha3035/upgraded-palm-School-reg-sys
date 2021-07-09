package kg.megacom.SchoolRegSystem.dao;

import kg.megacom.SchoolRegSystem.models.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber, Long> {
    Optional<Subscriber> findByPhone(String phone);
}
