package com.example.inheritencedemo.entities;

public class Car extends Vehicle {
    private String model;

    public Car(String model) {
        super("2027", "good");
        this.model = model;
    }

    @Override
    public void move() {
        super.move();
        System.out.println(type + model);
    }
}
