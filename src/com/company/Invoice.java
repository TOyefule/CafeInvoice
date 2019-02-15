package com.company;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Item> invoiceItems = new ArrayList<>();
    private String date;
    private String customerName;
    private String address;
    private String state;
    private String accountNumber;

    public ArrayList<Item> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<Item> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public Invoice() {

    }

    public Invoice(String date, String customerName,
                   String address, String accountNumber) {
        this.date = date;
        this.customerName = customerName;
        this.address = address;
        this.accountNumber = accountNumber;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}