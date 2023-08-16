package com.example.testtest.discount;

import com.example.testtest.member.Member;

public interface DiscountPolicy {
    int getDiscount(Member member, int price);
}
