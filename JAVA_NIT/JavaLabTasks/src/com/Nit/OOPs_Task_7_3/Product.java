package com.Nit.OOPs_Task_7_3;


public class Product {

		int productId;
		String productName;
		double price;
		int quantity;
		
		public Product(int productId, String productName, double price, int quantity) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}

		public static Product createProduct(int productId, String productName, double price, int quantity) {
			
			return new Product(productId, productName, price, quantity);
		}
		public double calculateTotalAmount() {
			double totalAmount;
			if((price*quantity)>1000) {
				totalAmount=(price*quantity)*0.9;
				return totalAmount;
			}
			else if((price*quantity)>500) {
				totalAmount=(price*quantity)*0.95;
				return totalAmount;
			}
			else{
				totalAmount=(price*quantity);
				return totalAmount;
			}
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
					+ quantity + " totalAmount= "+calculateTotalAmount()+"]";
		}
		
}
