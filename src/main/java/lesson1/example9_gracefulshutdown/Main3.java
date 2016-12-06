package lesson1.example9_gracefulshutdown;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.example9_gracefulshutdown"})
public class Main3 {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main3.class);

        ctx.registerShutdownHook();

        while(true) {}

    }

}
