package com.example.testinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Car car;

    @Autowired
    public void setCar(@Qualifier("BMW") Car car) {
        this.car = car;
    }

    @GetMapping("/")
    public String getModel() {
        return car.getModel();
    }
}
