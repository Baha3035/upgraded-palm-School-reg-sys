package kg.megacom.SchoolRegSystem.services;

import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;
import kg.megacom.SchoolRegSystem.models.entities.Subscriber;

public interface SubscriberService {
    SubscriberDto getOrCreate(SubscriberDto subscriberDto);
}
