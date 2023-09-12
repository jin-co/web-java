package com.example.demo.order;

import com.example.demo.member.Member;

public interface OrderService {
    Order createOrder(int id, String name, Member member, int price);
}
