package com.Nit.OOPs_Task_5_1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		TwoDigitsSum n1 = new TwoDigitsSum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two digit number:");
		int num =sc.nextInt();
//		n1.setNumber(num);
		n1.getSumOfDigits(num);;
		sc.close();
	}

}
