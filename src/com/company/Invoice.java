package com.company;

import java.util.ArrayList;

public class Invoice {
    private String date;
    private String customerName;
    private String address;
    private String accountNumber;
    private ArrayList<String> InvoiceItems = new ArrayList<>();


    public Invoice() {
    }

    public Invoice(String date, String customerName,
                   String address, String accountNumber,
                   ArrayList<String> invoiceItems) {
        this.date = date;
        this.customerName = customerName;
        this.address = address;
        this.accountNumber = accountNumber;
        InvoiceItems = invoiceItems;
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

    public ArrayList<String> getInvoiceItems() {
        return InvoiceItems;
    }

    public void setInvoiceItems(ArrayList<String> invoiceItems) {
        InvoiceItems = invoiceItems;
    }


}