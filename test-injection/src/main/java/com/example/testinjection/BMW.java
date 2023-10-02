package com.example.testinjection;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {

    @Override
    public String getModel() {
        return "BMW";
    }
}
