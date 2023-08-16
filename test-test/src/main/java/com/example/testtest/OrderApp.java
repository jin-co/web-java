package com.example.testtest;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedDiscount;
import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "TOM", Grade.VIP);
        AppConfig appConfig = new AppConfig();
        OrderService orderService = appConfig.orderService();
        DiscountPolicy discountPolicy = appConfig.discountPolicy();
        int price = 10000;
        int discount = discountPolicy.getDiscount(member, price);
        Order o1 = orderService.createOrder(1L, "O1", price, discount);
        System.out.println("discount = " + o1);
    }
}
