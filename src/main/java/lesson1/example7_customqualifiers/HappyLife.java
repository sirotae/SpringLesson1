package lesson1.example7_customqualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyLife {

    @Autowired
    private @DogType Animal dog;

    @Autowired
    private @CatType Animal cat;

    @Override
    public String toString() {
        return "HappyLife {" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}