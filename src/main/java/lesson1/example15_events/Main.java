package lesson1.example15_events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"lesson1.example15_events"})
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        LoginEventPublisher cvp = context.getBean(LoginEventPublisher.class);
        cvp.publish();

    }
}