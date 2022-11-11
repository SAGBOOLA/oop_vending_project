package org.example.model;

public class Chocolates   implements Product {

    private final int id;
    private String name;
    private double price;


    public Chocolates(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String examine() {
        return "Chocolate{" +
                "Id:" + id +
                ", Name:" + name +
                ", Price:" + price +
                '}';
    }

    @Override
    public String use() {
        return "Nuts and fruits milk chocolate";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setProductName(String productName) {
        this.name = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
