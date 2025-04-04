package com.Nit.OOPs_Task_19_1_Method_Overloading;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.multiply(num1, num2));
		
	}

}
