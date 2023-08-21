package com.example.testtest.order;

public class Order {
    private Long orderId;
    private String orderName;
    private int price;
    private int discountPrice;

    public Order(Long orderId, String orderName, int price, int discountPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public int getTotal() {
        return price - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
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

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }
}
