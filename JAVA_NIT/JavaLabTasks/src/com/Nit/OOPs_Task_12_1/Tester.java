package com.Nit.OOPs_Task_12_1;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		double average;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name:");
		String name = sc.nextLine();
//		sc.nextLine();
		System.out.print("Enter student id:");
		int id = sc.nextInt();
		System.out.print("Enter course:");
		String course = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter student fee:");
		double fee = sc.nextDouble();
		System.out.print("Enter average:");
		average = sc.nextDouble();
		if(average>0)
		{
			Student s1 = new Student(name,id,course,fee,average);
			System.out.println(s1.toString());
		}
		else
		{
			System.err.println("Error: Average mark must be between 0 and 100.");
			return;
		}
		
		sc.close();
		


	}

}
