package com.Nit.OOPs_Task_1_3_1;

public class Televison {
	String name;
	int cost;
	String quality;
	double size;
	String model;
	
	public void getTvInformation()
	{
		System.out.println("Name of the TV: "+name);
		System.out.println("Cost of the TV: "+cost);
		System.out.println("Quality of the TV: "+quality);
		System.out.println("Size of the TV: "+size);
		System.out.println("Model of the TV: "+model);
	}
	
	public void finalCost()
	{
		System.out.println("The final of TV including 10% discount is: "+(cost-(cost*0.05)));
	}
}
