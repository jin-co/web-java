package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        Member member = new Member(1L, "Tom", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(1L, "i1", 10000);
        System.out.println("order = " + order);
    }
}
