package com.example.testtest.config;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.discount.RatePolicy;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(new RatePolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RatePolicy();
    }
}
