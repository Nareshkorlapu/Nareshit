package com.Nit.OOPs_Task_20_1_Method_Overloading;

public class PartTimeEmployee extends Employee{

	protected double hourlyRate;
	protected int hoursWorked;
	public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double calculateSalary()
	{
		return hoursWorked*hourlyRate;
	}
}
