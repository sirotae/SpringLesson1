package lesson1.example3_factorybean;

import lesson1.common_interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.example3_factorybean"})
public class Example3Main {

    @Bean
    public MessageRendererFactoryBean getFactory() {
        MessageRendererFactoryBean factory = new MessageRendererFactoryBean();
        factory.setLanguage("EN");
        return factory;
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example3Main.class);

        MessageRendererFactoryBean factoryBean = ctx.getBean(MessageRendererFactoryBean.class);

        try {
            MessageRenderer mr = factoryBean.getObject();
            mr.render();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}