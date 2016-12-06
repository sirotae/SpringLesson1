package lesson1.example14_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan({"lesson1.example14_profile.*"})
public class Main {

    public static void main(String... args) throws InterruptedException {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("Vegeterian");
        ctx.register(Main.class);
        ctx.refresh();

        FoodProvider fp = ctx.getBean(FoodProvider.class);

        List<Food> lunchSet = fp.provideLunchSet();

        for (Food food: lunchSet) {
            System.out.println("Food: " + food.getName());
        }

    }
}
