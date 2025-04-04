package com.Nit.OOPs_Task_9_1;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:");
		String name = sc.nextLine();
		System.out.println("Enter Student Marks");
		int marks = sc.nextInt();
		
		Student s1 = new Student(name,marks);
		
		StudentGrade stdGrade = CalculateStudentGrade.calculateGrade(s1);
		System.out.println(stdGrade);
		
		sc.close();
	

	}

}
