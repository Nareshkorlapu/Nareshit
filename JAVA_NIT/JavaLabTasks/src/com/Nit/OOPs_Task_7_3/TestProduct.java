package com.Nit.OOPs_Task_7_3;

import java.util.Scanner;

public class TestProduct {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the id of the product: ");
			int productId = sc.nextInt();
			System.out.print("Enter the name of product: ");
			String productName = sc.nextLine();
			sc.nextLine();
			System.out.print("Enter the price of product: ");
			double price = sc.nextDouble();
			System.out.print("Enter the quantity of the product: ");
			int quantity = sc.nextInt();

			Product p1=Product.createProduct(productId, productName, price, quantity);
			System.out.println(p1);
		}

}
