package com.example.testinjection;

import org.springframework.stereotype.Component;

@Component
public class Ford implements Car {

    @Override
    public String getModel() {
        return "Ford";
    }
}
