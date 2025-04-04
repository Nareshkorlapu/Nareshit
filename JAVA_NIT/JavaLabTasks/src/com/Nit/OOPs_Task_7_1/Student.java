package com.Nit.OOPs_Task_7_1;

import java.util.*;

public class Student {
	String name;
	int age;
	String grade;
	public Student(String name, int age, String grade) {
//		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public static Student createStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name = sc.nextLine();
		System.out.print("Enter Student age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter grade of the student: ");
		String grade = sc.nextLine();
		return new Student(name, age, grade);
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
