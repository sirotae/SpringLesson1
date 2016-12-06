package lesson1.example5_primary;

import lesson1.common_classes.StandardOutMessageRenderer;
import lesson1.common_interfaces.MessageProvider;
import lesson1.common_interfaces.MessageRenderer;
import lesson1.common_more_classes.ChineeseMessageProvider;
import lesson1.common_more_classes.EnglishMessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.example5_primary"})
public class Example5Main {

    @Bean
    @Primary
    public MessageProvider getChineese() {
        return new ChineeseMessageProvider();
    }

    @Bean
    public MessageProvider getEnglish() {
        return new EnglishMessageProvider();
    }

    @Bean
    public MessageRenderer getRenderer() {
        return new StandardOutMessageRenderer();
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example5Main.class);

        MessageRenderer mr = ctx.getBean(MessageRenderer.class);
        mr.render();
    }
}