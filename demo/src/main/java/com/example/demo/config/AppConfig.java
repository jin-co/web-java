package com.example.demo.config;

import com.example.demo.discount.DiscountPolicy;
import com.example.demo.discount.FixedPolicy;
import com.example.demo.member.MemberRepository;
import com.example.demo.member.MemberService;
import com.example.demo.member.MemberServiceImpl;
import com.example.demo.member.MemoryRepository;
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
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryRepository());
    }
}
