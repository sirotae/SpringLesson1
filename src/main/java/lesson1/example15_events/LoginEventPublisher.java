package lesson1.example15_events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class LoginEventPublisher implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publish() {
        LoginEvent ce = new LoginEvent(this);
        publisher.publishEvent(ce);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}