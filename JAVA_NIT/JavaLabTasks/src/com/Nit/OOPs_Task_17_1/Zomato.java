package com.Nit.OOPs_Task_17_1;

import java.util.*;
public class Zomato {

	public static void main(String[] args) {
//		Order order1 = new Order(101, "Chiken Biryani", 255);
//		Customer c = new Customer(1, "NARESH", "MOOSAPET", order1);
//		System.out.println(c);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Order Id: ");
		int oId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Item Name: ");
		String iName = sc.nextLine();
		System.out.print("Enter Item Price: ");
		double iPrice = sc.nextDouble();
		Order o = new Order(oId, iName, iPrice);
		System.out.print("Enter Customer ID: ");
		int cId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name: ");
		String cName = sc.nextLine();
		System.out.print("Enter Customer Address: ");
		String cAddr = sc.nextLine();
		Customer c = new Customer(cId, cName, cAddr, o);
		System.out.println(c);

	}

}
class Order
{
	private int orderId;
	private String itemName;
	private double itemPrice;
	public Order(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "orderId=" + orderId + "\nitemName=" + itemName + "\nitemPrice=" + itemPrice ;
	}
	
}
class Customer
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;	//HAS-A relation
	public Customer(int customerId, String customerName, String customerAddress, Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer \n--------------\ncustomerId=" + customerId + "\ncustomerName=" + customerName + "\ncustomerAddress="
				+ customerAddress + "\norder\n---------------\n" + order ;
	}
	
}