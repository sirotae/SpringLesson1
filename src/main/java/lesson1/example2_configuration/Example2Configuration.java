package lesson1.example2_configuration;

import lesson1.common_classes.HelloWorldMessageProvider;
import lesson1.common_interfaces.MessageProvider;
import lesson1.common_interfaces.MessageRenderer;
import lesson1.common_classes.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example2Configuration {

    @Bean
    public MessageProvider messageProvider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
