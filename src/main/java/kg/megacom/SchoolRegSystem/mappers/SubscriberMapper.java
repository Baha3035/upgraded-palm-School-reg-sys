package kg.megacom.SchoolRegSystem.mappers;

import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;
import kg.megacom.SchoolRegSystem.models.entities.Subscriber;

public interface SubscriberMapper {
    Subscriber toSubscriber(SubscriberDto subscriberDto);
    SubscriberDto toSubscriberDto(Subscriber subscriber);
}
