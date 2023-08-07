package com.example.testtest.discount;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;

public class FixedPolicy implements DiscountPolicy {
    private int fixedDiscount = 1000;

    @Override
    public int discountPrice(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }
}
