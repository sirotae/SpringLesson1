package lesson1.example9_gracefulshutdown;

import lesson1.common_interfaces.MessageRenderer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.example9_gracefulshutdown"})
public class Main1 {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main1.class);

        MessageRenderer mr1 = ctx.getBean(MessageRenderer.class);
        mr1.render();

        ctx.close();

    }
}