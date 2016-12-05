package lesson1.example4_problem_multiplecandidates;

import lesson1.common_interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"lesson1.common_interfaces", "lesson1.common_classes", "lesson1.common_more_classes", "lesson1.example4_problem_multiplecandidates"})
public class Example4MainProblem {


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Example4MainProblem.class);

        MessageRenderer mr = ctx.getBean(MessageRenderer.class);
        mr.render();
    }
}