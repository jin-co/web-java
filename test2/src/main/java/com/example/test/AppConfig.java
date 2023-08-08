package com.example.test;

import com.example.test.discount.FixedDiscountPolicy;
import com.example.test.discount.RateDiscountPolicy;
import com.example.test.member.MemberRepository;
import com.example.test.member.MemberService;
import com.example.test.member.MemberServiceImpl;
import com.example.test.member.MemoryMemberRepository;
import com.example.test.order.OrderService;
import com.example.test.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    private MemoryMemberRepository getMemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
    }

    private RateDiscountPolicy getDiscountPolicy() {
        return new RateDiscountPolicy();
    }
}
