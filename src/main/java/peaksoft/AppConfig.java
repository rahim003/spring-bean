package peaksoft;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("application.properties")
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "myCat")
    @Scope("prototype")
    public Cat cat(){
        return new Cat();
    }

}
