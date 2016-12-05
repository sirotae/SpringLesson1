package lesson1.example5_primary;

import lesson1.common_interfaces.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomMessageProviderPrimary implements MessageProvider {

    @Autowired
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}
