package com.example.demo;

import com.example.demo.member.Grade;
import com.example.demo.member.Member;
import com.example.demo.order.Order;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member = new Member(1, "tom", Grade.VIP);
        OrderService orderService = new OrderServiceImpl();
        Order o1 = orderService.createOrder(1, "o1", member, 10000);
        System.out.println("orderService = " + o1);
    }
}
