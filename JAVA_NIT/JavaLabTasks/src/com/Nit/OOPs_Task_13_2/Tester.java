package com.Nit.OOPs_Task_13_2;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("1.Student Class:");
		System.out.println("Enter Student ID:");
		int id = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Exam Fee:");
		double examFee = sc.nextDouble();
		System.out.println("Enter Payment Amount:");
		double amount = sc.nextDouble();
		
		
		System.out.println("2.Student Class:");
		System.out.println("Enter Student ID:");
		int id1 = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name1 = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Exam Fee:");
		double examFee1 = sc.nextDouble();
		System.out.println("Enter Payment Amount:");
		double amount1 = sc.nextDouble();
		System.out.println("Enter Transport Amount:");
		double transportFee = sc.nextDouble();
		
		
		System.out.println("3.Student Class:");
		System.out.println("Enter Student ID:");
		int id2 = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name2 = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Exam Fee:");
		double examFee2 = sc.nextDouble();
		System.out.println("Enter Transport Fee:");
		double hostelFee = sc.nextDouble();
		System.out.println("Enter Payment Amount:");
		double amount2 = sc.nextDouble();
		
		
		Student s1 = new Student(id, name, examFee);
		s1.payFee(amount);
		System.out.println(s1);
		
		System.out.println("=============================================");
		
		DayScholar d1 = new DayScholar(id1, name1, examFee1, transportFee);
		d1.payFee(amount1);
		System.out.println(d1);
		
		System.out.println("=============================================");
		
		Hosteller h1 = new Hosteller(id2, name2, examFee2, hostelFee);
		h1.payFee(amount2);
		System.out.println(h1);
	}

}
