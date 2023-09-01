package com.example.testtest.config;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.MemberRepository;
import com.example.testtest.member.MemoryRepository;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixedPolicy();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(new FixedPolicy());
    }
}
