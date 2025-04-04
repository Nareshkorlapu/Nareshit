package com.Nit.OOPs_Task_7_2;

import java.util.*;
public class Employee {
	int id;
	String name;
	double salary;
	String department;
	double annualSalary;
	double annsal;
	
	public Employee(int id, String name, double salary, String department, double annsal) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.annsal = annsal;
	}
	public static Employee createEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter employee salary: ");
		double salary = sc.nextDouble();
		double annsal=salary*12;
		System.out.println("Enter employee department: ");
		sc.nextLine();
		String department = sc.nextLine();
		return new Employee(id,name,salary,department,annsal);
		
	}
	
	public void calculateAnnualSalary()
	{
		annualSalary=annsal;
		
		if(this.department == "Sales")
		{
			annualSalary=1.1*annualSalary;
		}
		else if(this.department == "Enginerring")
		{
			annualSalary=1.15*annualSalary;
		}
		else if(this.department == "HR")
		{
			annualSalary=1.08*annualSalary;
		}
		else
		{
			annualSalary=1.05*annualSalary;
		}
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", annualSalary=" + annualSalary + "]";
	}
	
	
}
