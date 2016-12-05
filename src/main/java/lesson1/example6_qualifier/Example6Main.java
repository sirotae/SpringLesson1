package lesson1.example6_qualifier;

import lesson1.common_classes.StandardOutMessageRenderer;
import lesson1.common_interfaces.MessageRenderer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.example6_qualifier"})
public class Example6Main {

    @Bean
    @Qualifier("qualified_name")
    public String getMessage() {
        return "qualified message";
    }

    @Bean
    public String getOtherMessage() {
        return "this is other message...";
    }

    @Bean
    public MessageRenderer getRenderer() {
        return new StandardOutMessageRenderer();
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example6Main.class);

        MessageRenderer mr = ctx.getBean(MessageRenderer.class);
        mr.render();
    }
}