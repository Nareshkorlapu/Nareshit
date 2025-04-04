package com.Nit.OOPs_Task_20_1_Method_Overloading;
import java.util.*;
public class EmployeeSalary {

	public static void main(String[] args) {
		Employee e =null;
		Scanner sc =new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees");
		System.out.println("2) Part Time Employee");
		System.out.println("Please select the Employee type");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter Fulltime Employee Id :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Fulltime Employee Name :");
			String name = sc.nextLine();
			System.out.println("Enter the Salary :");
			double sal = sc.nextDouble();
			if(id<=0)
			{
				System.err.println("Id can't be negaticve");
			}
			else if(sal<=0)
			{
				System.err.println("Salary can't be negative");
				return;
			}
			e = new FullTimeEmployee(id,name,sal);
			System.out.println(name+" Salary is :"+e.calculateSalary());
			break;
		
		case 2:
			System.out.println("Enter PartTime Employee Id :");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter PartTime Employee Name :");
			name = sc.nextLine();
			System.out.println("Enter your hourly rate: ");
			double rate = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter your total works hour in the month : ");
			int hoursWorked = sc.nextInt();
			if(id<=0)
			{
				System.err.println("Id can't be negative");
				return;
				
			}
			else if(rate<=0)
			{
				System.err.println("Employee hourly rate can't be zero OR Negative");
				return;
			}
			else if(hoursWorked<=0)
			{
				System.err.println("Employee hours of work can't be Negative");
				return;
			}
			else
			{
				e= new PartTimeEmployee(id,name,rate,hoursWorked);
				System.out.println(name+" Salary is :"+e.calculateSalary());	
			}
			
		}
	}

}
