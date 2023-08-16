package com.example.testtest;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.member.MemoryRepository;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryRepository());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixedPolicy();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }
}
