package com.Nit.OOPs_Task_19_2_Method_Overloading;

import java.util.*;

public class ShapeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println("Enter value: ");
		double num1 = sc.nextDouble();
		int num2 = sc.nextInt();
		int num2_1 = sc.nextInt();
		calc.calculateArea(num1);
		calc.calculateArea(num2);
		calc.calculateArea(num2, num2_1);
	}

}