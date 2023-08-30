package com.example.testtest.order;

public class Order {
    private Long orderId;
    private String orderName;
    private int price;
    private int discount;

    public Order(Long orderId, String orderName, int price, int discount) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
        this.discount = discount;
    }

    public int getTotalPrice() {
        return price - discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
