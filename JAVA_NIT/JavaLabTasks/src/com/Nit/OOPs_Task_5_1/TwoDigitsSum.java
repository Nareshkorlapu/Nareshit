package com.Nit.OOPs_Task_5_1;

public class TwoDigitsSum {
	int number;
	int lastnum;
	int firstnum;
	
//	public void setNumber(int num) {
//	number=num;
//	}
	
	public void getSumOfDigits(int num)
	{
		lastnum=num%10;
		firstnum=num/10;
		System.out.println("Sum of two digits is: "+(firstnum+lastnum));
	}
}
