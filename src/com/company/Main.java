package com.company;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         //Tax(); Calc();
        Scanner userInput = new Scanner(System.in);
        Item item = new Item();
        Invoice i = new Invoice();
        ArrayList<Item> invoiceList = new ArrayList<>();
        double taxRate;
        taxRate = 0.05;
        double tax = item.subTotal * taxRate;
        double subTotal = 0;
        double grandTotal = subTotal + tax;

        //   Customer Information input
        System.out.println("Enter your name: ");
        i.setCustomerName(userInput.nextLine());
        System.out.println("Enter your address: ");
        i.setAddress(userInput.nextLine());
        System.out.print("What State are you in? (MD|VA|DC|Other)?  " );
        i.setState(userInput.next
                ());
        if (i.getState().equalsIgnoreCase("MD")){ taxRate = 0.06; }
        else if (i.getState().equalsIgnoreCase("VA")) { taxRate = 0.0575; }
        else if (i.getState().equalsIgnoreCase("DC")) { taxRate = 0.053; }
        else taxRate = 0.05;
        userInput.nextLine();
        System.out.println("Enter the date: ");
        i.setDate(userInput.nextLine());
        System.out.println("Enter your account number: ");
        i.setAccountNumber(userInput.nextLine());

        String anotherOne = "";
        // Do-While Loop.. While input is not 'No' program loop will continue
        while (!anotherOne.equalsIgnoreCase("no")) {

            //Item information Input
            System.out.println("Enter item name: ");
            item.setName(userInput.nextLine());
            String name = item.getName();

            System.out.println("Price: ");
            item.setPrice(userInput.nextDouble());
            double price = item.getPrice();

            System.out.println("Quantity: ");
            item.setQuantity(userInput.nextInt());
            int quant = item.getQuantity();

            // Sets Tax rate equal to 1 if Taxable is false, else taxrate will be normal.
            System.out.println("Taxable (true|false): ");
                userInput.nextLine();
            boolean isTaxable = Boolean.parseBoolean(userInput.next());
            System.out.println("Taxable? "+ isTaxable);
            if ( isTaxable == true) {
                item.setTaxable(userInput.nextBoolean());

            } else taxRate = 1;
            System.out.println("Add Another item (yes|no): ");
            anotherOne = userInput.nextLine();

            invoiceList.add(new Item(name, price, quant, isTaxable));
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Customer name: " + i.getCustomerName());
        System.out.println("Address: " + i.getAddress());
        System.out.println("State: " + i.getState());  // Adds State to the Address, to keep information flow as well as system check.
        System.out.println("Date: " + i.getDate());
        System.out.println("Account Number: " + i.getAccountNumber());
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Item Name            Quantity             Price                   Cost                  Taxable                ");
        System.out.println("==============================================================================================================");
        for (Item item1 : invoiceList) {
            System.out.println(item1.getName() + "                " + item1.getQuantity() + "                " + item1.getPrice() + "           "
                    + item1.getPrice() * item1.getQuantity() + "                    " + item1.isTaxable() + " ");

            // incrementally Adds Item price times amount to item.subtotal;
            item.subTotal += item1.getPrice()*item1.getQuantity();
        }
        System.out.println();
        System.out.println("Subtotal: $" + item.subTotal);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Sales Tax: $" + String.format("%.02f", item.subTotal*taxRate));
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Total: $" + String.format("%.02f", item.subTotal*(1+taxRate)));


        }


    }
//        // Do-While Loop output
//        //      System.out.println();
//            System.out.println("Subtotal: $" + subTotal);
//            double tax = subTotal * .06;
//            double grandTotal = subTotal + tax;
//
//            System.out.println("Tax: " + tax);
//
//
//    public class Calculation {
//        public Calculation(String state) {
//            this.state = state;
//        }
//
//        public Calculation(String state, double taxRate, double subTotal) {
//            this.state = state;
//            this.taxRate = taxRate;
//            this.subTotal = subTotal;


//