package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.*;

class OrderAppTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Member member = new Member(1L, "mA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(1L, "iA", 10000);
        Assertions.assertThat(order.getDiscount()).isEqualTo(1000);
    }
}