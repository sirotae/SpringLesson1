package lesson1.example14_profile.Vegetarian;

import lesson1.example14_profile.Food;
import lesson1.example14_profile.FoodProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Profile("Vegeterian")
@Component
public class FoodProviderImpl  implements FoodProvider {

    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Vegetables"));
        lunchSet.add(new Food("Rice"));

        return lunchSet;
    }
}