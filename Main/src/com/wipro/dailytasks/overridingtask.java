package com.wipro.dailytasks;

import java.util.Scanner;


class Customer {
 public double calculateDiscount(double amount) {
     return 0;
 }
}


class RegularCustomer extends Customer {
 @Override
 public double calculateDiscount(double amount) {
     return amount * 0.05; 
 }
}


class PremiumCustomer extends Customer {
 @Override
 public double calculateDiscount(double amount) {
     return amount * 0.10; 
 }
}


class Employee extends Customer {
 @Override
 public double calculateDiscount(double amount) {
     return amount * 0.20; 
 }
}


public class overridingtask {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    
     System.out.println("Enter the customer type (Regular, Premium, Employee):");
     String customerType = scanner.nextLine();

     System.out.println("Enter the purchase amount:");
     double purchaseAmount = scanner.nextDouble();

     
     Customer customer;
     switch (customerType.toLowerCase()) {
         case "regular":
             customer = new RegularCustomer();
             break;
         case "premium":
             customer = new PremiumCustomer();
             break;
         case "employee":
             customer = new Employee();
             break;
         default:
             System.out.println("Invalid customer type. No discount applied.");
             customer = new Customer(); 
             break;
     }

     
     double discount = customer.calculateDiscount(purchaseAmount);
     System.out.println("Discount: " + discount);
     System.out.println("Final Amount: " + (purchaseAmount - discount));
 }
}


