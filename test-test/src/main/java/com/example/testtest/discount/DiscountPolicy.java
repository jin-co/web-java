package com.example.testtest.discount;

import com.example.testtest.member.Member;

public interface DiscountPolicy {
    int discountPrice(Member member, int price);
}
