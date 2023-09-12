package com.example.demo.order;

import com.example.demo.config.AppConfig;
import com.example.demo.discount.DiscountPolicy;
import com.example.demo.member.Member;

public class OrderServiceImpl implements OrderService{
    AppConfig appConfig = new AppConfig();
    DiscountPolicy discountPolicy = appConfig.discountPolicy();

    @Override
    public Order createOrder(int id, String name, Member member, int price) {
        int discount = discountPolicy.getDiscount(member);
        return new Order(id, name, price, discount);
    }
}
