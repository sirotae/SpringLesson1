package lesson1.common_more_classes;

import lesson1.common_interfaces.MessageProvider;
import org.springframework.stereotype.Component;

@Component
public class ChineseMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World (Chinese world)!";

    }
}
