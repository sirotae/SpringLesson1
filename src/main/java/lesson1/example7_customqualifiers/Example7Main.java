package lesson1.example7_customqualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"lesson1.example7_customqualifiers"})
public class Example7Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example7Main.class);

        HappyLife happy = ctx.getBean(HappyLife.class);
        System.out.println(happy.toString());
    }
}
