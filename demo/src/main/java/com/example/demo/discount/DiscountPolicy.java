package com.example.demo.discount;

import com.example.demo.member.Member;

public interface DiscountPolicy {
    int getDiscount(Member member);
}
