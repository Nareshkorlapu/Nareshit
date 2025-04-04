package com.Nit.OOPs_Task_7_2;

import java.util.Scanner;


public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of employees: ");
		int noOfEmployees = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<noOfEmployees;i++)
		{
			Employee e1 = Employee.createEmployee();
			e1.calculateAnnualSalary();
			System.out.println(e1);
		}

	}

}
