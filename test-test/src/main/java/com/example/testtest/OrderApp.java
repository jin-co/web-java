package com.example.testtest;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "Tom", Grade.VIP);
        DiscountPolicy discountPolicy = new FixedPolicy();
        OrderService orderService = new OrderServiceImpl();
        int discount = discountPolicy.getDiscount(member, 10000);
        Order o1 = orderService.createOrder(1L, "O1", 10000, discount);
        System.out.println("orderService = " + o1);
    }
}
