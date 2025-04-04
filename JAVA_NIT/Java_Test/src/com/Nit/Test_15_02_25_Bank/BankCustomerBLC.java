package com.Nit.Test_15_02_25_Bank;

public class BankCustomerBLC {
    String bankName;
    String bankCustomerName;
    String bankAddress;
    String bankIFSCCode;
    int customerAccountNumber;
    static int currentBalance=1000;

    public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, int customerAccountNumber) {
        this.bankName = bankName;
        this.bankCustomerName = bankCustomerName;
        this.bankAddress = bankAddress;
        this.bankIFSCCode = bankIFSCCode;
        this.customerAccountNumber = customerAccountNumber;
    }

    public void withdraw(double amount) {
        if (currentBalance <= 1000) {
            System.out.println("Insufficient balance");
        } else if ((currentBalance - amount) < 1000) {
            System.out.println("Maintain Minimum Balance");
        } else {
            currentBalance -= amount; 
            System.out.println("Transaction Successful.");
            System.out.println("Available Balance: Rs." + currentBalance);
        }
    }

    public void deposit(double amount) {
        currentBalance += amount; 
        System.out.println("Deposited Successfully.");
        System.out.println("Available Balance: Rs." + currentBalance);
    }

    public void currentBalance() {
        System.out.println("Current Balance: Rs." + currentBalance);
    }

    public String displayDetails() {
        return "[Bank Name is: " + bankName + ", Bank Customer Name is: " + bankCustomerName + ", Bank Address is: " + bankAddress + 
               ", Bank IFSC Code is: " + bankIFSCCode + ", Customer Account Number is: " + customerAccountNumber + ", Current Balance is: " + currentBalance + "]";
    }
}
