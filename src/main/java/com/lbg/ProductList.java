package com.lbg;

import java.util.ArrayList;
import java.util.Random;

public class ProductList {
    private ArrayList<Product> items;


    public ProductList() {
        items = new ArrayList<>();
    }
    public void generate(){

        Random rand = new Random();

        for(int i =1; i<=10; i++){
            double price = rand.nextDouble() * 100;
            int quantity = rand.nextInt(20);
            double vatRatePercentage = rand.nextDouble() * 100;
            String description= "Product Number " + i;
            boolean insuranceAvailable = rand.nextBoolean();
            String productID = String.valueOf(i);
            Product product = new Product(productID,price,quantity,vatRatePercentage,description,insuranceAvailable);
            items.add(product);

        }

    }

    public void display(){
        for(Product p : items) System.out.println(p);
    }

    public ArrayList<Product> getItems() {

        return items;
    }

    public void setItems(ArrayList<Product> items) {

        this.items = items;
    }
}
