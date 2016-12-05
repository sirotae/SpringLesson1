package lesson1.example1;

import lesson1.common_interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.example1"})
public class Example1Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example1Main.class);

        MessageRenderer mr1 = ctx.getBean(MessageRenderer.class);
        mr1.render();

        // check singleton scope
        MessageRenderer mr2 = ctx.getBean(MessageRenderer.class);

        System.out.println(mr1==mr2);

    }
}
