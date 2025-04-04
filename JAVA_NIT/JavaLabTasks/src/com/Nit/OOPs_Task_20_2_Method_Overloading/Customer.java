package com.Nit.OOPs_Task_20_2_Method_Overloading;

public class Customer {

	protected String name;

	public Customer(String name) {
		super();
		if(name == null || name.isEmpty())
		{
			System.err.println(" Customer name cannot be empty.");
			System.exit(0);
		}
		this.name = name;
	}
	public void calculateBill(double... prices)
	{
		double total = 0.0;
			for(double price : prices)
			{
				if(price<=0)
				{
					System.err.println("Error! Negative price Cannot calculate bill");
					return;
				}
				
				total+=price;
			}
			System.out.println("Customer Name: "+this.name);
			System.out.println("Total cost RS: "+total);
			System.out.println("Discount: No discount for regular customers.");
		}
	
	
}
