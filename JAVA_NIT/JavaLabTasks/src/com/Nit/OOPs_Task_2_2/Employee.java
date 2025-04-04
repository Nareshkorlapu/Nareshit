package com.Nit.OOPs_Task_2_2;

import java.util.Scanner;
public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ID of the employee: ");
		employeeId = sc.nextInt();
		System.out.print("Enter name of the employee: ");
		employeeName = sc.nextLine();
		employeeName = sc.nextLine();
		System.out.print("Enter Salary of the employee: ");
		employeeSalary = sc.nextDouble();		
		
	}
	
	public void getEmployeeData()
	{
		System.out.println("ID of the employee is: "+employeeId);
		System.out.println("Name of the employee is: "+employeeName);
		System.out.println("Salary of the employee is: "+employeeSalary);
		
	}
}
