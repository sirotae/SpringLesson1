package lesson1.example15_events;

import org.springframework.context.ApplicationEvent;

public class LoginEvent extends ApplicationEvent {

    public LoginEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My Custom Event";
    }

}