package lesson1.example9_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("lesson1.example9_scope")
public class Main {
    public static void main(String... args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CoffeeMachine machine = context.getBean(CoffeeMachine.class);
        machine.setSerialNr(11111);

        machine = context.getBean(CoffeeMachine.class);
        System.out.println("Coffee machine serial No: " + machine.getSerialNr());

        Coffee coffee = context.getBean(Coffee.class);
        coffee.setBrand("Java");
        System.out.println("Coffee brand: " + coffee.getBrand());

        coffee = context.getBean(Coffee.class);
        System.out.println("Coffee brand: " + coffee.getBrand());
    }
}
