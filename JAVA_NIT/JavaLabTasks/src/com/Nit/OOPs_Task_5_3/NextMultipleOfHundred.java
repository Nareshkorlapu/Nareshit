package com.Nit.OOPs_Task_5_3;

public class NextMultipleOfHundred {
	int lastTwoDigits;
	int addedNum;
	
	public void getNextMultipleOfHundred(int num)
	{
		lastTwoDigits=num%100;
		addedNum=100-lastTwoDigits;
		System.out.println("Next multiple of hundred of"+num+"is: "+(num+addedNum));
		
	}
}
