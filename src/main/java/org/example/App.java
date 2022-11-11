package org.example;

import org.example.model.Candies;
import org.example.model.Chocolates;
import org.example.model.Product;
import org.example.model.ProteinBar;
import org.example.service.VendingMachine;

public class App
{
    public static void main( String[] args ) {
        Product[] products = {
                new Candies(1, "Haribo", 15),
                new Candies(2, "Mentos", 9.95),
                new Chocolates(3,"Dairy", 34),
                new Chocolates(4,"Snickers", 24.95),
                new ProteinBar(5, "NutriBar", 60),
                new ProteinBar(6, "PowerUp", 80)
        };
        VendingMachine implement = new VendingMachine(products);
        for (String list : implement.getProducts()){
            System.out.println(list);
        }
        System.out.println("----------------");
        implement.addCurrency(200);
        implement.request(4);
        System.out.println(implement.getBalance());
        System.out.println(implement.getDescription(4));
    }


}
