package com.example.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient01Application.class, args);
    }

    @RequestMapping("/hi")
    public String sayHi(String name) {
        return "hi, my name is " + name;
    }
}
