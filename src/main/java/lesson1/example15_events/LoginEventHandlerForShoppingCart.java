package lesson1.example15_events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginEventHandlerForShoppingCart implements ApplicationListener<LoginEvent> {

    public void onApplicationEvent(LoginEvent event) {
        System.out.println("Shopping cart handler. Event caught:" + event.toString());
    }

}