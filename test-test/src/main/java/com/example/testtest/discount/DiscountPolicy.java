package com.example.testtest.discount;

import com.example.testtest.member.Member;

public interface DiscountPolicy {
    int Discount(Member member, int price);
}
