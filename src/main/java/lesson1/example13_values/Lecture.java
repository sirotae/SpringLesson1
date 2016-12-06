package lesson1.example13_values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lecture {

    @Value("${lecture.topic}")
    private String lectureTopic;

    @Value("${java.version}")
    private String javaVersion;


    public String getLectureTopic() {
        return lectureTopic;
    }

    public String getJavaVersion() {
        return javaVersion;
    }
}
