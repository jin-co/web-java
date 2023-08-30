package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "tom", Grade.VIP);
        OrderService orderService = new OrderServiceImpl();
        int price = 10000;
        Order order1 = orderService.createOrder(1L, "order1", price, member);
        System.out.println("price = " + order1);
    }
}
