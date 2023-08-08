package com.example.testtest.discount;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;

public class FixedPolicy implements DiscountPolicy {
    private int discount = 1000;

    @Override
    public int Discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discount;
        } else {
            return 0;
        }
    }
}
