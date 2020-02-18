package com.hinkmond.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GreetingApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GreetingApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("The Web application named, GreetingApplication, is being started by Spring Boot!");
        SpringApplication.run(GreetingApplication.class, args);
    }

}