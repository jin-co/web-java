package com.example.testinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Car car;

//    @Autowired
//    public DemoController(Car car) {
//        this.car = car;
//    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @GetMapping("/")
    public String getDailyWorkout() {
        return car.getModel();
    }
}
