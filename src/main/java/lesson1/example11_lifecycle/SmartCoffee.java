package lesson1.example11_lifecycle;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SmartCoffee {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @PostConstruct
    public void init() {
        System.out.println("Coffee post-construct: call on mobile phone that coffee is ready");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Coffee pre-destroy: ping cleaner to clean a cup");
    }
}