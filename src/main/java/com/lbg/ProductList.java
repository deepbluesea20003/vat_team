package com.lbg;

import java.util.ArrayList;
import java.util.Random;

public class ProductList {
    private ArrayList<Product> items;


    public ProductList() {
        items = new ArrayList<>();
    }
    public void generate(){
        //TODO: add 10 items to the list
        Random rand = new Random();

        for(int i =1; i<=10; i++){
            double price = rand.nextDouble() * 100;
            int quantity = rand.nextInt(20);
            double vatRatePercentage = rand.nextDouble() * 100;
            String description= "Product Number " + i;
            boolean insuranceAvailable = rand.nextBoolean();
            Product product = new Product(price,quantity,vatRatePercentage,description,insuranceAvailable);
            items.add(product);

        }



    }

    public String toString(){
        return "";
    }

    public ArrayList<Product> getItems() {

        return items;
    }

    public void setItems(ArrayList<Product> items) {

        this.items = items;
    }
}
