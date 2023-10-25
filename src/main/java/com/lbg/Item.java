package com.lbg;

public class Item extends Product{
    private int warrantyPeriod;
    public Item(String productID, double price, int quantity, double vatRate, String description, boolean insuranceAvailable, int wp){
        super(productID,price,quantity,vatRate,description,insuranceAvailable);
        warrantyPeriod = wp;
    }

    @Override
    public String toString()
    {
        return getProductID() + "  " + getDescription() + "  " + getPrice() + "  " + getVatRate() + "  " + getQuantity() + " " + warrantyPeriod;
    }
}
