package org.example.model;

public class ProteinBar implements Product {

    private final int id;
    private String name;
    private double price;


    public ProteinBar(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String examine() {
        return "Protein Bar{" +
                "Id:" + id +
                ", Name:" + name +
                ", Price:" + price +
                '}';
    }

    @Override
    public String use() {
        return "Healthy bar for bulking";
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
