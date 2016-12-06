package lesson1.example11_lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("lesson1.example11_lifecycle")
public class Main {
    public static void main(String... args) throws InterruptedException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        SmartCoffeeMachine machine = context.getBean(SmartCoffeeMachine.class);
        SmartCoffee coffee = context.getBean(SmartCoffee.class);

        context.registerShutdownHook();
    }
}
