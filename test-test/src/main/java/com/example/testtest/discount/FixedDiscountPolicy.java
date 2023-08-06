package com.example.testtest.discount;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {
    private int fixedDiscountAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return fixedDiscountAmount;
        }
        return 0;
    }
}
