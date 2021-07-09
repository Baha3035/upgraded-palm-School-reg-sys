package kg.megacom.SchoolRegSystem.mappers.impl;

import kg.megacom.SchoolRegSystem.mappers.SubscriberMapper;
import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;
import kg.megacom.SchoolRegSystem.models.entities.Subscriber;
import org.springframework.stereotype.Service;

@Service
public class SubscriberMapperImpl implements SubscriberMapper {
    @Override
    public Subscriber toSubscriber(SubscriberDto subscriberDto) {
        Subscriber subscriber = new Subscriber();
        subscriber.setAge(subscriberDto.getAge());
        subscriber.setDateOfBirth(subscriberDto.getDateOfBirth());
        subscriber.setName(subscriberDto.getName());
        subscriber.setPhone(subscriberDto.getPhone());

        return subscriber;
    }

    @Override
    public SubscriberDto toSubscriberDto(Subscriber subscriber) {
        SubscriberDto subscriberDto = new SubscriberDto();
        subscriberDto.setAge(subscriber.getAge());
        subscriberDto.setDateOfBirth(subscriber.getDateOfBirth());
        subscriberDto.setName(subscriber.getName());
        subscriberDto.setPhone(subscriber.getPhone());

        return subscriberDto;
    }
}
