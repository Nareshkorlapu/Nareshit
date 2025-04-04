package com.Nit.OOPs_Task_14_1;

import java.util.*;
public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter permanent employee Id:");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter permanent employee Name:");
		String employeeName = sc.nextLine();
		System.out.print("Enter permanent employee Salary :");
		double employeeSalary = sc.nextDouble();
		PermanentEmployee p = new PermanentEmployee(employeeId, employeeName, employeeSalary);
		if(employeeId>0)
		{
			if(employeeName.isBlank() || employeeName.isEmpty())
			{
				System.out.println("Employee name cant't be null");
			}
			else
			{
				if(employeeSalary>0)
				{
					System.out.println(p);
					p.netSalary();
				}
				else
				{
					System.out.println("Employee Salary can't be negative or 0");
				}
			}
		}
		else
		{
			System.out.println("Invalid employee id");
		}
		
		System.out.println("=====================================================================");
		
		System.out.print("Enter Contract employee Id:");
		employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Contract employee Name:");
		employeeName = sc.nextLine();
		System.out.print("Enter Contract employee Salary :");
		employeeSalary = sc.nextDouble();
		System.out.print("Enter contract duration in year:");
		int contractDuration = sc.nextInt();
		ContractEmployee c = new ContractEmployee(employeeId, employeeName, employeeSalary,contractDuration);
		
		if(employeeId>0)
		{
			if(employeeName.isBlank() || employeeName.isEmpty())
			{
				System.out.println("Employee name cant't be null");
			}
			else
			{
				if(employeeSalary>0)
				{
					if(contractDuration>0)
					{
						System.out.println(c);
					}
					else
					{
						System.out.println("Contract Duration not 0 or negative");
					}
				}
				else
				{
					System.out.println("Employee Salary can't be negative or 0");
				}
			}
		}
		else
		{
			System.out.println("Invalid employee id");
		}
		
		

	}

}
