package com.example.testtest.discount;

import com.example.testtest.member.Grade;

public class FixedPolicy implements DiscountPolicy {
    private int fixedDiscount = 1000;

    @Override
    public int discountPrice() {
        if (true) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }
}
