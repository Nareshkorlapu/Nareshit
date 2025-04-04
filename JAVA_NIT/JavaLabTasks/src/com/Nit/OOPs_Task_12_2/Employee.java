package com.Nit.OOPs_Task_12_2;

import java.util.*;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int id,String name,double salary)
	{
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
	}
	
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		double salary = sc.nextDouble();
		
		return new Employee(id,name,salary);
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
