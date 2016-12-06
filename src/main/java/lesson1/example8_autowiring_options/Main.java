package lesson1.example8_autowiring_options;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson1.example8_autowiring_options")
public class Main {

    @Bean
    public String produceSerialNr() {
        return "SerialNumber";
    }

    public static void main(String... args) throws InterruptedException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        FoodProcessor fp = ctx.getBean(FoodProcessor.class);
        System.out.print(fp.getSerialNr());
    }
}
