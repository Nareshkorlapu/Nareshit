package com.Nit.OOPs_Task_5_4;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		RoundedSum result = new RoundedSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		System.out.println("Enter c value:");
		int c = sc.nextInt();
		
		System.out.println("Rounded vaule is: "+(result.sumOfRoundedValues(a, b, c)));
		sc.close();
		

	}

}
