package uk.co.ijump.kata;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class ApiConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ApiConfiguration.class, args);


    }

}
