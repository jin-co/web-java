package com.example.test.singleton;

public class StateService {
//    private int price; // price can be changed by other users

    public int order(String name, int price) {
        System.out.println("name + pi = " + name + price);
//        this.price = price;
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
