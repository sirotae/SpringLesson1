package lesson1.example10_lifecycle;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SmartCoffeeMachine {

    private long serialNr;

    public long getSerialNr() {
        return serialNr;
    }

    public void setSerialNr(long serialNr) {
        this.serialNr = serialNr;
    }

    @PostConstruct
    public void init() {
        System.out.println("check on startup");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("clean on shutdown");
    }
}