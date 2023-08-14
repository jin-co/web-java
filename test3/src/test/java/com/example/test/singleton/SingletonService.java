package com.example.test.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { }

    public void logic() {
        System.out.println("instance = " + instance);
    }
}
