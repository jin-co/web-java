package com.example.testtest;

import com.example.testtest.config.AppConfig;
import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Member member = new Member(1L, "tom", Grade.VIP);
        OrderService orderService = ac.getBean("orderService", OrderService.class);
        int price = 10000;
        Order order1 = orderService.createOrder(1L, "order1", price, member);
        System.out.println("price = " + order1);
    }
}
