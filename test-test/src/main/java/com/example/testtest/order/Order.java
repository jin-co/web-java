package com.example.testtest.order;

public class Order {
    private Long id;
    private String name;
    private int price;
    private int discountPrice;

    public Order(Long id, String name, int price, int discountPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public int getTotal() {
        return price - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
