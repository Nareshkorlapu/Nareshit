package com.Nit.OOPs_Task_5_3;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		NextMultipleOfHundred n = new NextMultipleOfHundred();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		n.getNextMultipleOfHundred(num);
		sc.close();

	}

}
