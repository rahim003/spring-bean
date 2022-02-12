package peaksoft;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@Scope("prototype")
public class Cat {

    @Value("${cat.name}")
    private String name;
    @Value("${cat.gender}")
    private String gender;
    @Value("${cat.age}")
    private int age;

    public Cat(String name, String gender, int age) {

        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Cat(HelloWorld helloWorld) {
    }
}
