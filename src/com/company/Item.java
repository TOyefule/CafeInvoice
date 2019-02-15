package com.company;

import java.util.ArrayList;

public class Item {


    private String name;
    private double price;
    private int quantity;
    private boolean taxable;


    //   ConstructorX
    public Item() {
    }

    //   Overloaded Constructor

    public Item(String name, double price, int quantity, boolean taxable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
//        this.description = description;
//        this.code = code;
    }


    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}

