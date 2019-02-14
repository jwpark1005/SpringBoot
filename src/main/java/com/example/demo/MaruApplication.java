package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @SpringBootApplication = @Configuration ,@EnableAutoConfiguration,@ComponentScan
@EnableAutoConfiguration()
@ComponentScan(basePackages = {"com.example.demo"})
public class MaruApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaruApplication.class, args);
    }
}
