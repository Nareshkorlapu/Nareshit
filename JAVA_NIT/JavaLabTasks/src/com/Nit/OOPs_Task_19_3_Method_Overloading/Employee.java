package com.Nit.OOPs_Task_19_3_Method_Overloading;
public class Employee
{
	private int hoursWorked;
	private double hourlyRate;
	private double annualSalary;
	private double salesAmount;
	private double commisionRate;
	
	public Employee(double hourlyRate,int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public Employee(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}
	public Employee(double salesAmount,double commisionRate)
	{
		this.salesAmount = salesAmount;
		this.commisionRate = commisionRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public double calculateSalary(double hourlyRate,int hoursWorked)
	{
		
		return hoursWorked*hourlyRate;
	}
	public double calculateSalary(double annualSalary)
	{
		return annualSalary/12;
	}
	public double calculateSalary(double salesAmount,double commisionRate)
	{
		return salesAmount*commisionRate;
	}
}
