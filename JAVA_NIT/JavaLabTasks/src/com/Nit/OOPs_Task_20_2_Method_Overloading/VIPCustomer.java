package com.Nit.OOPs_Task_20_2_Method_Overloading;

public class VIPCustomer extends Customer
{
	protected double discountRate = 15.0;

	public VIPCustomer(String name) {
		super(name);

	}
	@Override
	public void calculateBill(double... prices)
	{
		double total = 0.0;
		for(double price:prices)
		{
			if(price<=0)
			{
				System.err.println("Error! Negative price Cannot calculate bill");
				return;
			}
			total+=price;
		}
		double discount=(total*discountRate)/100;
		double finalAmount = total - discount;
		System.out.println("Customer Name: "+this.name);
		System.out.println("Total cost RS : "+total);
		System.out.println("Discount RS: "+discount);
		System.out.println("Final Cost RS : "+finalAmount);
	}

	
}
