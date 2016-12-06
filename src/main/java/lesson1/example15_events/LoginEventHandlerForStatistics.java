package lesson1.example15_events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginEventHandlerForStatistics implements ApplicationListener<LoginEvent> {

    public void onApplicationEvent(LoginEvent event) {
        System.out.println("Statistics handler. Event caught:" + event.toString());
    }
}
