package com.example.testtest.order;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.FixedPolicy;
import com.example.testtest.member.*;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryRepository();
    private final DiscountPolicy discountPolicy = new FixedPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discount = discountPolicy.Discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }
}
