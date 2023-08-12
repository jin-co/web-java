package com.example.testtest.discount;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;

public class FixedDiscount implements DiscountService {
    private final int fixedDiscount = 1000;

    @Override
    public int getDiscount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }
}
