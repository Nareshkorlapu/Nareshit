package com.Nit.Test_15_02_25_Bank;

import java.util.*;

public class BankCustomerELC {
    public static void main(String[] args) {
        BankCustomerBLC customer = new BankCustomerBLC();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();
        System.out.print("Enter customer name: ");
        String bankCustomerName = sc.nextLine();
        System.out.print("Enter bank address: ");
        String bankAddress = sc.nextLine();
        System.out.print("Enter IFSC code: ");
        String bankIFSCCode = sc.nextLine();
        System.out.print("Enter customer account number: ");
        int customerAccountNumber = sc.nextInt();

        customer.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber);

        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        customer.deposit(amount);
        
        System.out.println("Enter amount to withdraw: ");
        amount = sc.nextDouble();
        customer.withdraw(amount);


        customer.currentBalance();

        System.out.println(customer.displayDetails());

        sc.close();
    }
}
