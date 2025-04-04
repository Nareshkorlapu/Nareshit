package com.Nit.OOPs_Task_20_2_Method_Overloading;

import java.util.Scanner;
public class ShoppingMall_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please select the Customer Type to get additional Discount :\r\n"+ "        1) General Customer\r\n"
				+ "        2) Prime Customer\r\n"
				+ "        3) VIP Customer\r\n"
				+ "       \r\n"
				+ "       Please enter Customer type :");
		int option=sc.nextInt();
		sc.nextLine();
		int count=0;
		System.out.print("Please Enter your Name :");
		String name=sc.nextLine();
		if(name.isEmpty()|| name.isBlank()) {
			System.out.print("Customer name cannot be empty.");
			return;
		}
		System.out.print("Please Enter total no of items :");
		int noOfItems=sc.nextInt();
		String []items=new String[noOfItems];
		double []prices= new double[noOfItems];
		for(int i=0;i<noOfItems;i++) {
			sc.nextLine();
			System.out.print((i+1)+")Item Name :");
			items[i]=sc.nextLine();
			System.out.print("Item Price :");
			prices[i]=sc.nextDouble();
		}
		System.out.println("Welcome to Hyderabad Mall :");
		for(int i=0;i<noOfItems;i++) {
			if(prices[i]<0) {
				count++;
			}
		}
		if(count!=0) {
			System.out.print("Item price cannot be negative.");
			return;
		}
		switch(option) {
		case 1:{
			Customer c1=new Customer(name);
			c1.calculateBill(prices);
		}
		break;
		case 2:{
			PrimeCustomer p1=new PrimeCustomer(name);
			p1.calculateBill(prices);
		}
		break;
		case 3:{
			VIPCustomer v1=new VIPCustomer(name);
			v1.calculateBill(prices);
		}
		break;
		}
		sc.close();
	}
}
