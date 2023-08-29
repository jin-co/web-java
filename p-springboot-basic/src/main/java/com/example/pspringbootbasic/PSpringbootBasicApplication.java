package com.example.pspringbootbasic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class PSpringbootBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PSpringbootBasicApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("ctx bundle = " + ctx);
            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String bean : beans) {
                System.out.println("ctx = " + bean);
            }
        };
    }

}
