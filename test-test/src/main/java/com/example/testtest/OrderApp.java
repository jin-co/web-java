package com.example.testtest;

import com.example.testtest.config.AppConfig;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);
        Order o1 = orderService.createOrder(1L, "o1", 10000);
        System.out.println("orderService = " + o1);
    }
}
