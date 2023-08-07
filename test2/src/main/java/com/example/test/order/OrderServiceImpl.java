package com.example.test.order;

import com.example.test.discount.DiscountPolicy;
import com.example.test.discount.FixedDiscountPolicy;
import com.example.test.discount.RateDiscountPolicy;
import com.example.test.member.Member;
import com.example.test.member.MemberRepository;
import com.example.test.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    private final DiscountPolicy discountPolicy = new FixedDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
