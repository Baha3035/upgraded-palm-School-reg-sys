package kg.megacom.SchoolRegSystem.services.impl;

import kg.megacom.SchoolRegSystem.dao.SubscriberRepo;
import kg.megacom.SchoolRegSystem.exceptions.SubscriberNotFoundException;
import kg.megacom.SchoolRegSystem.mappers.SubscriberMapper;
import kg.megacom.SchoolRegSystem.mappers.impl.SubscriberMapperImpl;
import kg.megacom.SchoolRegSystem.models.dto.SubscriberDto;
import kg.megacom.SchoolRegSystem.models.entities.Subscriber;
import kg.megacom.SchoolRegSystem.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {
    @Autowired
    private SubscriberMapper subscriberMapper;
    @Autowired
    private SubscriberRepo subscriberRepo;

    @Override
    public SubscriberDto getOrCreate(SubscriberDto subscriberDto) {
        Subscriber subscriber = subscriberMapper.toSubscriber(subscriberDto);
        try{
            subscriber = subscriberRepo.findByPhone(subscriberDto.getPhone()).orElseThrow(
                    () -> new SubscriberNotFoundException()
            );
        }
        catch (SubscriberNotFoundException e){
            subscriber = subscriberRepo.save(subscriber);
        }
        return subscriberMapper.toSubscriberDto(subscriber);
    }
}
