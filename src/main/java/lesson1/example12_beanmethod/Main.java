package lesson1.example12_beanmethod;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("lesson1.example12_beanmethod")
public class Main {

    @Bean(destroyMethod = "destroy")
    public DataSource createDataSource () {
        return new DataSource();
    }

    public static void main(String... args) throws InterruptedException {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        DataSource ds = ctx.getBean(DataSource.class);

        ctx.registerShutdownHook();
    }
}
