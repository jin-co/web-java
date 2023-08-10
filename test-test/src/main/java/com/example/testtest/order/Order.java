package com.example.testtest.order;

public class Order {
    private Long id;
    private String itemName;
    private int price;
    private int discount;

    public Order(Long id, String itemName, int price, int discount) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.discount = discount;
    }

    public int getMoney() {
        return price - discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
