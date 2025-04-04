package com.Nit.OOPs_Task_5_2;

public class TwoDigitsDifference {

		int number;
		int lastnum;
		int firstnum;
		
		public void getSumOfDigits(int num)
		{
			lastnum=num%10;
			firstnum=num/10;
			System.out.println("Difference of two digits is: "+(firstnum-lastnum));
		}
	}

