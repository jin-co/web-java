package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import com.example.testtest.order.Order;
import com.example.testtest.order.OrderService;
import com.example.testtest.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderAppTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void createOrder() {
        Member member = new Member(1L, "tom", Grade.VIP);
        memberService.join(member);
        Order o1 = orderService.createOrder(1L, "o1", 10000, member);
        Assertions.assertThat(o1.getTotalPrice()).isEqualTo(9000);
    }
}