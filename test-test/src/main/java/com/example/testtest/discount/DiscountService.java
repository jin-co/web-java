package com.example.testtest.discount;

import com.example.testtest.member.Member;

public interface DiscountService {
    int getDiscount(Member member, int price);
}
