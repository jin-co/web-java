package com.example.testtest.order;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order createOrder(Long orderId, String orderName, int price, int discount) {
        return new Order(orderId, orderName, price, discount);
    }
}
