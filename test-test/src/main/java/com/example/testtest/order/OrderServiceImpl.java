package com.example.testtest.order;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.Member;

public class OrderServiceImpl implements OrderService{
    DiscountPolicy discountPolicy = new FixedPolicy();


    @Override
    public Order createOrder(Long orderId, String orderName, int price, Member member) {
        int discount1 = discountPolicy.getDiscount(member, price);
        return new Order(orderId, orderName, price, discount1);
    }
}
