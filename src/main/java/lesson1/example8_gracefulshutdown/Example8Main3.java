package lesson1.example8_gracefulshutdown;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.example8_gracefulshutdown"})
public class Example8Main3 {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Example8Main3.class);

        ctx.registerShutdownHook();

        while(true) {}

    }

}
