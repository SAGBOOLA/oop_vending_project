package org.example.service;

import org.example.model.Product;

public class VendingMachine implements IVendingMachine {

    private static final int[] DENOMINATIONS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    private Product[] products;
    private int depositPool;


    public VendingMachine(Product[] products){
        this.products = products;
    }



    @Override
    public void addCurrency(int amount){
        for (int denomination : DENOMINATIONS){
            if (denomination == amount){
                depositPool += amount;
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products){
            if (product.getId() == id){
                if (product.getPrice() <= depositPool){
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else{
                    throw new RuntimeException("Your deposit of " + depositPool + "is insufficient to purchase the" + product.getProductName());
                }
            }
        }
        throw new RuntimeException("ID: " + id + "has no available product");
    }

    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products){
            if (product.getId() == id){
                return product.examine() + "," + " " + "Description: " + product.use();
            }
        }
        return "ID: " + id + "has no available product";
    }

    @Override
    public String[] getProducts() {
        String [] allProducts = new String[products.length];
        for (int i = 0; i< products.length; i++){
            allProducts[i] = products[i].examine();
        }
        return allProducts;
    }
}
