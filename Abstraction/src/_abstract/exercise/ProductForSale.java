package _abstract.exercise;

import java.util.ArrayList;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalePrice(int quantity){
        return quantity * price;
    }

    public void printLineItem(int quantity){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                quantity,price,type,description);
    }

    public abstract void showDetails();
}
