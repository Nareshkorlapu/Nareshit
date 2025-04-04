package com.Nit.OOPs_Task_20_1_Method_Overloading;

public class FullTimeEmployee extends Employee
{
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	@Override
	public double calculateSalary()
	{
		return salary;
		
	}
	
	
}
