package com.Nit.OOPs_Task_20_2_Method_Overloading;

import java.util.Scanner;

class Customer2 {
    protected String name;

    // Parameterized constructor to initialize customer name
    public Customer2(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Customer name cannot be empty.");
            System.exit(0);
        }
        this.name = name;
    }

    // Method to calculate bill (varargs for multiple items)
    public void calculateBill(double... prices) {
        double totalCost = 0.0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            totalCost += price;
        }
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount: No discount for regular customers.");
    }
}

class GeneralCustomer2 extends Customer2 {

    // Constructor to initialize GeneralCustomer
    public GeneralCustomer2(String name) {
        super(name);
    }

    // Override calculateBill method
    @Override
    public void calculateBill(double... prices) {
        super.calculateBill(prices);  // Call superclass method (no discount)
    }
}

class PrimeCustomer2 extends Customer2 {
    protected double discountRate = 10.0;

    // Constructor to initialize PrimeCustomer
    public PrimeCustomer2(String name) {
        super(name);
    }

    // Override calculateBill method
    @Override
    public void calculateBill(double... prices) {
        double totalCost = 0.0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            totalCost += price;
        }
        double discount = (totalCost * discountRate) / 100;
        double finalAmount = totalCost - discount;
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount RS: " + discount);
        System.out.println("Final amount RS: " + finalAmount);
    }
}

class VIPCustomer2 extends Customer2 {
    protected double discountRate = 15.0;

    // Constructor to initialize VIPCustomer
    public VIPCustomer2(String name) {
        super(name);
    }

    // Override calculateBill method
    @Override
    public void calculateBill(double... prices) {
        double totalCost = 0.0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            totalCost += price;
        }
        double discount = (totalCost * discountRate) / 100;
        double finalAmount = totalCost - discount;
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS: " + totalCost);
        System.out.println("Discount RS: " + discount);
        System.out.println("Final amount RS: " + finalAmount);
    }
}

public class ShoppingMall2 {

    // Method to generate bill based on the customer type
    public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the Customer Type to get additional Discount :");
        System.out.println("1) General Customer");
        System.out.println("2) Prime Customer");
        System.out.println("3) VIP Customer");
        System.out.print("Please enter Customer type : ");
        int option = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        Customer c = null;

        switch (option) {
            case 1:
                System.out.print("Please Enter your Name: ");
                String name = sc.nextLine();
                System.out.print("Enter number of Items: ");
                int items = sc.nextInt();
                double[] prices = new double[items];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i = 0; i < items; i++) {
                    System.out.print((i + 1) + ") Item Price : ");
                    prices[i] = sc.nextDouble();
                }
                c = new GeneralCustomer(name);
                generateBill(c, prices);
                break;

            case 2:
                System.out.print("Please Enter your Name: ");
                name = sc.nextLine();
                System.out.print("Enter number of Items: ");
                items = sc.nextInt();
                prices = new double[items];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i = 0; i < items; i++) {
                    System.out.print((i + 1) + ") Item Price : ");
                    prices[i] = sc.nextDouble();
                }
                c = new PrimeCustomer(name);
                generateBill(c, prices);
                break;

            case 3:
                System.out.print("Please Enter your Name: ");
                name = sc.nextLine();
                System.out.print("Enter number of Items: ");
                items = sc.nextInt();
                prices = new double[items];
                System.out.println("Please Enter the Item Name and Price :");
                for (int i = 0; i < items; i++) {
                    System.out.print((i + 1) + ") Item Price : ");
                    prices[i] = sc.nextDouble();
                }
                c = new VIPCustomer(name);
                generateBill(c, prices);
                break;

            default:
                System.out.println("Invalid option. Please select a valid customer type.");
                break;
        }
    }
}

