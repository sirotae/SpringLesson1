package lesson1.example9_gracefulshutdown;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.example9_gracefulshutdown"})
public class Main2 {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main2.class);

        Runtime.getRuntime().addShutdownHook(new ShutdownHook(ctx));

        while(true) {}

    }






    public static class ShutdownHook extends Thread {

        private final ConfigurableApplicationContext ctx;

        public ShutdownHook(ConfigurableApplicationContext ctx) {
            this.ctx = ctx;
        }

        @Override
        public void run() {
            System.out.println("graceful shutdown of context");
            ctx.close();
        }

    }
}