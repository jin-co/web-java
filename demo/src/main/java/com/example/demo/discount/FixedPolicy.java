package com.example.demo.discount;

import com.example.demo.member.Grade;
import com.example.demo.member.Member;

public class FixedPolicy implements DiscountPolicy {
    private final int fixedDiscount = 1000;

    @Override
    public int getDiscount(Member member) {
        if (member.getGrade() == Grade.VIP) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }
}
