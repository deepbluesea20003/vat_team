package com.lbg;
public class Product
{
    private double price;
    private int quantity;

    private double vatRate;

    private boolean insuranceAvailable;


    public Product(double price, int quantity, double vatRate, boolean insuranceAvailable) {
        this.price = price;
        this.quantity = quantity;
        this.vatRate = vatRate;
        this.insuranceAvailable = insuranceAvailable;
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

    public boolean isInsuranceAvailable() {
        return insuranceAvailable;
    }

    public void setInsuranceAvailable(boolean insuranceAvailable) {
        this.insuranceAvailable = insuranceAvailable;
    }
}
