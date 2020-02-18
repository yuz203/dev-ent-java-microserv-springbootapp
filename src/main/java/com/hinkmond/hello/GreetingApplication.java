package com.hinkmond.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class GreetingApplication {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return beansProvidedBySpringBoot -> {
            System.out.println("CommandLineRunner called.  Now, list the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("GreetingApplication is starting up Spring Boot to run as a Web Application!");
        SpringApplication.run(GreetingApplication.class, args);
    }

}