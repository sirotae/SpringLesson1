package lesson1.example6_qualifier;

import lesson1.common_interfaces.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomMessageProviderQualifier implements MessageProvider {

    @Autowired
    @Qualifier("qualified_name")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}
