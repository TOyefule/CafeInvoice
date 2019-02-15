package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {Listing(); Tax();
        boolean anotherItem = true;
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> InvoiceItems = new ArrayList<>();
        Invoice i = new Invoice();
        Item item = new Item();


        // Customer Information input
        System.out.println("Enter your name: ");
        i.setCustomerName(userInput.nextLine());
        System.out.println("Enter your address: ");
        i.setAddress(userInput.nextLine());
        System.out.println("Enter the date: ");
        i.setDate(userInput.nextLine());
        System.out.println("Enter your account number: ");
        i.setAccountNumber(userInput.nextLine());


        // Do-While Loop
        while (anotherItem == true) {
            System.out.println("Enter item name: ");
            item.setName(userInput.next());
//            System.out.println("Price: ");
//                item.setPrice(userInput.nextLine());
            System.out.println("Quantity: ");
            item.setQuantity(userInput.next());
            System.out.println("Taxable (true|false): ");
            item.setTaxable(userInput.nextBoolean());
            System.out.println("Add Another item (True|False): ");
            anotherItem = userInput.nextBoolean();

        }

//
//        public static double Tax(){
//            String state = "";
//            double taxRate = 0.06;
//            if (state.equalsIgnoreCase("MD")) {
//                taxRate = 0.06;
//            } else if (state.equalsIgnoreCase("VA")) {
//                taxRate = 0.0575;
//            } else if (state.equalsIgnoreCase("DC")) {
//                taxRate = 0.05;
//            } else taxRate = 0.053;
//            return taxRate;
//        }

        String quit = "yes";
        Invoice invoice = new Invoice();


        ArrayList<Item> invoiceItems = new ArrayList<>();
        int tax = 0;
        int grandTotal = 0;

        // Customer Information output
        if (quit.equalsIgnoreCase("no")) {
            System.out.println();
            System.out.println("Customer Invoice");
            System.out.println("----------------------------------------");
            System.out.println("Customer Name: " + invoice.getCustomerName());
            System.out.println("Transaction Date: " + invoice.getDate());
            System.out.println();
            System.out.println("Name" + "\t\t" + "Description" + "\t\t" + "Price" + "\t\t" + "Quantity" + "\t\t" + "Subtotal");
            for ( invoiceItems : Item) {
                System.out.println(invoiceItems.getCode() + "\t\t" + invoiceItems.getName() + "\t\t" +
                        invoiceItems.getPrice() + "\t\t" + invoiceItems.getQuantity() + "\t\t" + invoiceItems.getSubTotal());
            }


            // Do-While Loop output
            System.out.println();
//            System.out.println("Subtotal: $" + subTotal);
//            double tax = subTotal * .06;
//            double grandTotal = subTotal + tax;
            System.out.println("Tax: " + tax);
            System.out.println("Grand Total: $" + grandTotal);
        }
    }
}