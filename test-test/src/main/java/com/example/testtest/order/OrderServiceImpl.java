package com.example.testtest.order;

import com.example.testtest.discount.DiscountPolicy;
import com.example.testtest.discount.DiscountPolicyImpl;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberRepository;
import com.example.testtest.member.MemoryRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryRepository();
    private final DiscountPolicy discountPolicy = new DiscountPolicyImpl();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
