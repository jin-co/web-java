package com.example.test.discount;

import com.example.test.member.Grade;
import com.example.test.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("10%")
    void vip_no_fee() {
        Member vip = new Member(1L, "vip", Grade.VIP);
        int discount = discountPolicy.discount(vip, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("10% fail")
    void vip_fee_fail() {
        Member vip = new Member(2L, "vip", Grade.BASIC);
        int discount = discountPolicy.discount(vip, 10000);
        Assertions.assertThat(discount).isEqualTo(0);
    }
}