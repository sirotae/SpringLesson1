package lesson1.common_more_classes;

import lesson1.common_interfaces.MessageProvider;
import org.springframework.stereotype.Component;

@Component
public class EnglishMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World (English world)!";

    }
}
