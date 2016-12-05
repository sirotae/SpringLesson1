package lesson1.example7_customqualifiers;

import org.springframework.stereotype.Component;

@CatType
@Component
public class Cat extends Animal {

    @Override
    public String toString() {
        return "Cat {}";
    }
}