package com.example.testtest;

import com.example.testtest.discount.FixedDiscount;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.member.MemoryRepository;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryRepository(),
                new FixedDiscount());
    }
}
