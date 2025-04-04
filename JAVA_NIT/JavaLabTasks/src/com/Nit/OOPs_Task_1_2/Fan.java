package com.Nit.OOPs_Task_1_2;

public class Fan {
	String name;
	String coil;
	int wings;
	
	
	public void getFanDetails()
	{
			System.out.println("Name of the fan is: "+name);
			System.out.println("Type of coil: "+coil);
			System.out.println("Number of wings are : "+wings);
		
	}
	public void switchOn(){
		System.out.println("Turning on the fan");
	}
	
	public void switchOff()
	{
		System.out.println("Turning off the fan");
	}
}
