package com.example.testtest.order;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberRepository;
import com.example.testtest.member.MemoryRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long orderId, String orderName, int price) {
        Member member = new Member(1L, "Tom", Grade.VIP);
        int discount = discountPolicy.getDiscount(member, price);
        return new Order(orderId, orderName, price, discount);
    }
}
