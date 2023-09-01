package com.example.testtest.order;

import com.example.testtest.config.AppConfig;
import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceImpl implements OrderService {
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    private Member member = new Member(1L, "tom", Grade.VIP);

    @Override
    public Order createOrder(Long id, String name, int price) {
        int discount1 = discountPolicy.getDiscount(member, price);
        return new Order(id, name, price, discount1);
    }
}
