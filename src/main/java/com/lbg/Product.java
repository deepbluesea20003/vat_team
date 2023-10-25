package com.lbg;
public class Product
{
    private String productID;
    private double price;
    private int quantity;

    private double vatRate;

    private String description;

    private boolean insuranceAvailable;


    public Product(String productID, double price, int quantity, double vatRate, String description, boolean insuranceAvailable) {
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.vatRate = vatRate;
        this.description = description;
        this.insuranceAvailable = insuranceAvailable;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInsuranceAvailable() {
        return insuranceAvailable;
    }

    public void setInsuranceAvailable(boolean insuranceAvailable) {
        this.insuranceAvailable = insuranceAvailable;
    }

    //TODO: Add a toString() option here to pretty print object
    @Override
    public String toString()
    {
        return productID + "  " + description + "  " + price + "  " + vatRate + "  " + quantity;
    }
}
