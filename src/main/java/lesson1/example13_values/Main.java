package lesson1.example13_values;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("lesson1.example13_values")
@PropertySource("classpath:example12.properties" )
public class Main {
    public static void main(String... args) throws InterruptedException {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        Lecture l = ctx.getBean(Lecture.class);
        System.out.println(l.getLectureTopic());
        System.out.println(l.getJavaVersion());

    }
}
