package com.example.test.discount;

import com.example.test.member.Member;

public interface DiscountPolicy {
    /*
    * @return return price
    * */
    int discount(Member member, int price);
}
