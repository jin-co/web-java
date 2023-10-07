package com.example.testinjection.config;

import com.example.testinjection.Car;
import com.example.testinjection.Ford;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Car ford() {
        return new Ford();
    }
}
