package lesson1.example8_autowiring_options;

import org.springframework.stereotype.Component;

@Component
public class FoodProcessor extends Appliance {

    public FoodProcessor(String serialNr) {
        super(serialNr);
    }

}
