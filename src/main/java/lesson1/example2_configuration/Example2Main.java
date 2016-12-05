package lesson1.example2_configuration;

import lesson1.common_interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.example2_configuration"})
public class Example2Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example2Main.class);

        MessageRenderer mr1 = ctx.getBean(MessageRenderer.class);
        mr1.render();

        // check singleton scope
        MessageRenderer mr2 = ctx.getBean(MessageRenderer.class);

        System.out.println(mr1==mr2);
    }
}
