package com.Nit.OOPs_Task_20_2_Method_Overloading;

public class GeneralCustomer extends Customer
{

	public GeneralCustomer(String name) {
		super(name);
	}
	@Override
	public void calculateBill(double... prices)
	{
		super.calculateBill(prices);
	}
	
}
