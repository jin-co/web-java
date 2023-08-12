package com.example.testtest.order;

import com.example.testtest.discount.DiscountService;
import com.example.testtest.discount.FixedDiscount;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberRepository;
import com.example.testtest.member.MemoryRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountService discountService;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountService discountService) {
        this.memberRepository = memberRepository;
        this.discountService = discountService;
    }

    @Override
    public Order createOrder(Long orderId, String itemName, int price) {
        Member member = memberRepository.findById(1L);
        int discount = discountService.getDiscount(member, price);
        return new Order(orderId,itemName, price, discount);
    }
}
