package com.example.inheritencedemo.entities;

public class Vehicle {
    private String dateProduced;
    private String speed;
    protected String type;

    public Vehicle(String dateProduced, String speed) {
        this.dateProduced = dateProduced;
        this.speed = speed;
    }

    public String getDateProduced() {
        return dateProduced;
    }

    public void setDateProduced(String dateProduced) {
        this.dateProduced = dateProduced;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("moving");
    }
}
