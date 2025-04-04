package com.Nit.OOPs_Task_20_2_Method_Overloading;
import java.util.*;
public class ShoppingMall {
//	

	public static void generateBill(Customer cust,double... prices)
	{
		cust.calculateBill(prices);
	}

	public static void main(String[] args) {
		Customer c =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("1) General Customer");
		System.out.println("2) Prime Customer");
		System.out.println("3) VIP Customer");
		System.out.println("Please enter Customer type :");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option)
		{
		case 1:
			System.out.println("Please Enter your Name: ");
			String name = sc.nextLine();
			if(name == null || name.isEmpty())
			{
				System.err.println("Customer name cannot be empty");
				return;
			}
			System.out.println("Enter number of Items :");
			int items = sc.nextInt();
			sc.nextLine();
			System.out.println("Please Enter the Item Name and Price :");
			String itemName = null;
			double itemPrice=0;
			c = new GeneralCustomer(name);
			double totalPrice=0.0;
			for(int i=1;i<=items;i++)
			{
				System.out.print(i+")Item Name :");
				itemName = sc.nextLine();
				System.out.print(" Item Price :");
				itemPrice = sc.nextDouble();
				sc.nextLine();
				totalPrice = totalPrice+itemPrice;
			}
			System.out.println("Welcome to Hyderabad Mall : ");
			c.calculateBill(totalPrice);
			break;
		case 2:
			System.out.println("Please Enter Your Name: ");
			name = sc.nextLine();
			if(name == null || name.isEmpty())
			{
				System.err.println("Customer name cannot be empty");
				return;
			}
			System.out.println("Enter Number of Items: ");
			items = sc.nextInt();
			sc.nextLine();
			System.out.println("Please Enter the Item Name and Price :");
			String itemName2;
			itemPrice=0;
			totalPrice=0.0;
			c = new PrimeCustomer(name);
			for(int i=1;i<=items;i++)
			{
				System.out.print(i+")Item Name :");
				itemName2 = sc.nextLine();
				System.out.print("Item Price :");
				itemPrice = sc.nextDouble();
				sc.nextLine();
				totalPrice = totalPrice+itemPrice;
			}
			System.out.println("Welcome to Hyderabad Mall :");
			c.calculateBill(totalPrice);
			break;
		case 3:
			System.out.println("Please Enter Your Name: ");
			name = sc.nextLine();
			if(name == null || name.isEmpty())
			{
				System.err.println("Customer name cannot be empty");
				return;
			}
			System.out.println("Enter Number of Items: ");
			items = sc.nextInt();
			sc.nextLine();
			System.out.println("Please Enter the Item Name and Price :");
			String itemName3 ;
			itemPrice=0;
			c = new PrimeCustomer(name);
			totalPrice = 0.0;
			for(int i=1;i<=items;i++)
			{
				System.out.print(i+")Item Name :");
				itemName3 = sc.nextLine();
				System.out.print("Item Price :");
				itemPrice = sc.nextDouble();
				sc.nextLine();
				totalPrice = totalPrice+itemPrice;
			}
			System.out.println("Welcome to Hyderabad Mall :");
			c.calculateBill(totalPrice);
			break;
		default:
			System.out.println("Invalid input option. Please enter again!!!");
			
			
		}
		

	}

}
