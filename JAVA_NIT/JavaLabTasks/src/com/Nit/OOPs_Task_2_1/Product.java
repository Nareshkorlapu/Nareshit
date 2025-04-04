package com.Nit.OOPs_Task_2_1;

import java.util.Scanner;
public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id of the product: ");
		productId = sc.nextInt();
		System.out.print("Enter Name of the product: ");
		productName = sc.nextLine();
		productName = sc.nextLine();
		System.out.print("Enter the cost the product: ");
		productPrice = sc.nextDouble();
		
	}
	
	public void getProductInfo()
	{
		System.out.println("Id number of the product is: "+productId);
		System.out.println("Name of the product is: "+productName);
		System.out.println("Cost of the product is: "+productPrice);
		
		
	}
}
