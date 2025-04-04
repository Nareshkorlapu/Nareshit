package com.Nit.OOPs_Task_1_1;

public class Dog {
	String name;
	double height;
	int age;
	
	public void getDogInformation()
	{
		System.out.println("Dog name is:"+name);
		System.out.println("Height of the dog:"+height);
		System.out.println("Age of the dog is:"+age);
	}
	
	public void bark()
	{
		System.out.println("The dog which was called as "+name+" And the age of that dog is "+age+" And it is "+height+" height.");
	}

}
