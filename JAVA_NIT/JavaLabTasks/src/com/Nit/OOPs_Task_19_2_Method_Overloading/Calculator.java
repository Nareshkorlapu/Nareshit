package com.Nit.OOPs_Task_19_2_Method_Overloading;

public class Calculator {

	public void calculateArea(int side)
	{
		if(side>0)
		{
		System.out.println("Area of square : "+(side*side));
		}
		else
		{
			System.err.println("Error! Side length must be non-negative");
		}
	}
	public void calculateArea(int length,int width)
	{
		if(length>0 && width>0)
		{
			System.out.println("Area of rectangle: "+(length*width));
			
		}
		else
		{
			System.err.println("Error! Length and Width must be non-negative");
		}
	}
	public void calculateArea(double radius)
	{
		
		
		if(radius>0)
		{
		System.out.println("Area of circle: "+(3.14*radius*radius));
		}
		else
		{
			System.err.println("Error! Radius must be non-negative");
		}
		
	}
}
