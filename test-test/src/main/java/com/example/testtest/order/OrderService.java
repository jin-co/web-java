package com.example.testtest.order;

public interface OrderService {
    Order createOrder(Long orderId, String orderName, int price);
}
