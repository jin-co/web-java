package com.example.test.discount;

import com.example.test.member.Grade;
import com.example.test.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy{
    private int fixedDiscountAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return fixedDiscountAmount;
        } else {
            return 0;
        }
    }
}
