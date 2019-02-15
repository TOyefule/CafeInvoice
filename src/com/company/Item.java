package com.company;

import java.util.ArrayList;

public class Item {


    private String name;
    private String price;
    private String quantity;
    private String description;
    private boolean taxable;
    private boolean anotherItem = false;
    private double  code;
    private double  subTotal;

    //   Constructor
    public Item() {
    }

    //   Overloaded Constructor

    public Item(String name, String price, String quantity, String description,
       boolean taxable, boolean anotherItem, double code, double subTotal) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.taxable = taxable;
        this.anotherItem = anotherItem;
        this.code = code;
        this.subTotal = subTotal;
    }


    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public boolean isAnotherItem() {
        return anotherItem;
    }

    public void setAnotherItem(boolean anotherItem) {
        this.anotherItem = anotherItem;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
