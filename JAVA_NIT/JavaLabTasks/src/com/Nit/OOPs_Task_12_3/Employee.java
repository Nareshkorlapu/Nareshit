package com.Nit.OOPs_Task_12_3;

public class Employee {
		
	private int employeeNumber;
	private String employeeName;
	
	public Employee(int eno, String ename)
	{
		this.employeeNumber = eno;
		this.employeeName = ename;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
}
