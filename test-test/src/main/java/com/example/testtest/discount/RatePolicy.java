package com.example.testtest.discount;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;

public class RatePolicy implements DiscountPolicy {
    private int discountPercent = 10;

    @Override
    public int getDiscount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * (discountPercent / 100);
        } else {
            return 0;
        }
    }
}
