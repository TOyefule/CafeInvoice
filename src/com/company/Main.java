package com.company;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {//Listing(); Tax();
        String anotherItem = "yes";
        Scanner userInput = new Scanner(System.in);
        Item item = new Item();
        Invoice i = new Invoice();
        ArrayList<Item> invoiceList = new ArrayList<>();


        //            Customer Information input
        System.out.println("Enter your name: ");
        i.setCustomerName(userInput.nextLine());
        System.out.println("Enter your address: ");
        i.setAddress(userInput.nextLine());
        System.out.println("Enter your state: ");
        i.setAddress(userInput.nextLine());
        System.out.println("Enter the date: ");
        i.setDate(userInput.nextLine());
        System.out.println("Enter your account number: ");
        i.setAccountNumber(userInput.nextLine());

        // System.out.println("This is a test of the System output")
//                                    System.out.println("---------------------------------------------------------------------------------------------------------------");
//                                    System.out.println("Customer name: " + i.getCustomerName());
//                                    System.out.println("Address: " + i.getAddress());
//                                    System.out.println("Date: " + i.getDate());
//                                    System.out.println("Account Number: " + i.getAccountNumber());
//                                    System.out.println("---------------------------------------------------------------------------------------------------------------");

        String anotherOne = "";
        // Do-While Loop
        while (!anotherOne.equalsIgnoreCase("no")) {

            invoiceList.add(new Item());

            System.out.println("Enter item name: ");
            item.setName(userInput.nextLine());

            System.out.println("Price: ");
            item.setPrice(userInput.nextDouble());

            System.out.println("Quantity: ");
            item.setQuantity(userInput.nextInt());

            System.out.println("Taxable (true|false): ");
            item.setTaxable(userInput.nextBoolean());
            userInput.nextLine();


            System.out.println("Add Another item (yes|no): ");
            anotherOne = userInput.nextLine();

        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Customer name: " + i.getCustomerName());
        System.out.println("Address: " + i.getAddress());
        System.out.println("Date: " + i.getDate());
        System.out.println("Account Number: " + i.getAccountNumber());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(anotherItem);
        System.out.println("Item Name              Quantity                Price                    Cost                    Taxable        ");
        System.out.println("===============================================================================================================");
        System.out.println(item.getName() + " " + item.getQuantity() + " " + item.getPrice() + " " + item.getPrice() * item.getQuantity() + "   " + item.isTaxable() + " ");


        //        for (Item item : invoiceList) {
//            System.out.println(Item.getName() + " " + item.getQuantity() + "  " + item.getPrice() + "  " + item.getPrice() * item.getQuantity() + "   " + item.isTaxable() + " ");
//        }
//    }
//        System.out.println("Subtotal: " + subTotal);
//        System.out.println("Tax: " + tax);
//        System.out.println();
//        System.out.println("---------------------------------------------------------------------------------------------------------------");
//        System.out.println("Total: " + grandTotal);
//
//        }
//
//        // Do-While Loop output
//        //      System.out.println();
//        //      System.out.println("Subtotal: $" + subTotal);
//            double tax = subTotal * .06;
//            double grandTotal = subTotal + tax;
//
//            System.out.println("Tax: " + tax);
//            System.out.println("Grand Total: $" + grandTotal);}


    }
}

//    public class Calculation {
//
//        //    public static double Tax( ){
////        String quit = "yes";
//        String state = " ";
//        double taxRate;
//        double subTotal;
////        double tax = subTotal * taxRate;
////        double grandTotal = subTotal + tax;
////
//
//        System.out.print("What State are you in? ");
//        if (state.equalsIgnoreCase("MD")) {
//            taxRate = 0.06;
//        } else if (state.equalsIgnoreCase("VA")) {
//            taxRate = 0.0575;
//        } else if (state.equalsIgnoreCase("DC")) {
//            taxRate = 0.053;
//        } else(taxRate = 0.05);
//
//



        /*
//        *  quantity * item.price = item.total
//        *  Calculate grand Total
//        *  if( Taxable == "true"){calc(tax.sum)};
//        *  (subtotal + sales tax)
//        *
//        * */
//
//
//        return grandTotal;
//    }
//    }
//
//
//
//
//}