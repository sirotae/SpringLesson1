package lesson1.example7_customqualifiers;

import org.springframework.stereotype.Component;

@DogType
@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog {}";
    }
}