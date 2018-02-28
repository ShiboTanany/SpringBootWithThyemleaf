package www.personalwebsite.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class PersonalwebsiteApplication {

    public static void main(String[] args) {

        SpringApplication.run(PersonalwebsiteApplication.class, args);
    }
}
