package com.example.testtest.order;

import com.example.testtest.member.Member;

public interface OrderService {
    Order createOrder(Long orderId, String orderName, int price, Member member);
}
