package com.example.testtest.order;

import com.example.testtest.discount.DiscountService;
import com.example.testtest.discount.FixedDiscount;
import com.example.testtest.member.*;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountService discountService;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountService discountService) {
        this.memberRepository = memberRepository;
        this.discountService = discountService;
    }

    @Override
    public Order createOrder(Long id, String itemName, int price) {
        Member member1 = memberRepository.findById(id);
        int discountPrice = discountService.getDiscount(member1, price);
        return new Order(id, itemName, price, discountPrice);
    }
}
