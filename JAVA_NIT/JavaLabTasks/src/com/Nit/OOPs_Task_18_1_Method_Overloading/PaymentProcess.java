package com.Nit.OOPs_Task_18_1_Method_Overloading;

import java.util.Scanner;

public class PaymentProcess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p = new Payment();

        System.out.println("Payment Menu");
        System.out.println("Please select any one Payment Method from the Menu :");
        System.out.println("\t\t 1) Payment by using Cash ");
        System.out.println("\t\t 2) Payment by using Credit Card ");
        System.out.println("\t\t 3) Payment by using Debit Card ");
        System.out.print("Please enter your Payment choice [1/2/3]: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter the amount you want to pay through cash: ");
                double cashAmount = sc.nextDouble();
                p.makePayment(cashAmount);
                break;

            case 2:
                System.out.print("Enter your name: ");
                String creditCardHolderName = sc.nextLine();
                System.out.print("Enter your 16 digit Credit Card Number: ");
                String creditCardNumber = sc.nextLine();
                System.out.print("Enter your Payment Amount: ");
                double creditCardAmount = sc.nextDouble();
                p.makePayment(creditCardHolderName, creditCardNumber, creditCardAmount);
                break;

            case 3:
                System.out.print("Enter your 16 digit Debit Card Number: ");
                String debitCardNumber = sc.nextLine();
                System.out.print("Enter your Payment Amount: ");
                double debitCardAmount = sc.nextDouble();
                sc.nextLine();
                p.makePayment(debitCardNumber, debitCardAmount);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        
        sc.close();
    }
}

