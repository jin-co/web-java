package com.example.testtest.order;

import com.example.testtest.member.Member;

public interface OrderService {
    Order createOrder(Long id, String itemName, int price);
}
