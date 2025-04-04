package com.Nit.OOPs_Task_7_1;

import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of students: ");
		int noOfStudent = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<noOfStudent;i++)
		{
			Student s1 = Student.createStudent();
			System.out.println(s1);
		}
//		sc.close();
	}

}
