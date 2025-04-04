package com.Nit.OOPs_Task_5_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		TwoDigitsDifference n1 = new TwoDigitsDifference();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two digit number:");
		int num =sc.nextInt();
		n1.getSumOfDigits(num);;
		sc.close();
	}

}
