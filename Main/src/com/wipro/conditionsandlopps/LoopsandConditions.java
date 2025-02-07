package com.wipro.conditionsandlopps;

import java.util.Scanner;

public class LoopsandConditions {
    
    static double balance = 5000.0;  
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int bankingSystem;
        
        
        do {
            System.out.println("\n Welcome to Ashraf's Bank");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Please choose an option (1-5): ");
            
            bankingSystem = scanner.nextInt();
            
            switch (bankingSystem) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    System.out.println("Thank You for choosing Ashraf's Bank Visit Again😊😊😊");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        } while (bankingSystem != 5);
    }

    
    public static void checkBalance() {
        System.out.println("Your current balance is 💵💵: Rs" + balance);
    }

    
    public static void depositMoney() {
        System.out.print("Enter the amount to deposit 💰💰: Rs");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Rs" + depositAmount + " has been deposited. Your new balance is Rs" + balance);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }

    
    public static void withdrawMoney() {
        System.out.print("Enter the amount to withdraw 💴💴: Rs");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Rs" + withdrawAmount + " has been withdrawn. Your Remaining balance is Rs" + balance);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal must be greater than 0.");
        }
    }

    public static void transferMoney() {
        System.out.print("Enter the amount to transfer 💸💸: Rs");
        double transferAmount = scanner.nextDouble();
        if (transferAmount > 0 && transferAmount <= balance) {
            balance -= transferAmount;
            System.out.println("Rs" + transferAmount + " has been transferred. Your Updated balance is Rs" + balance);
        } else if (transferAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
} 
