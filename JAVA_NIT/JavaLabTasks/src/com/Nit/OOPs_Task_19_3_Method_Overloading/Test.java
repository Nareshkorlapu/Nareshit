package com.Nit.OOPs_Task_19_3_Method_Overloading;

public class Test {

	public static void main(String[] args) {
		Employee HourEmp = new Employee(15,160);
		System.out.println("Monthly salary of hourly employee: "+HourEmp.calculateSalary(HourEmp.getHoursWorked(), HourEmp.getHourlyRate()));
		Employee SalaryEmp = new Employee(60000);
		System.out.println("Monthly salary of salaried employee: "+SalaryEmp.calculateSalary(SalaryEmp.getAnnualSalary()));
		Employee CommisionEmp = new Employee(50000, 0.10);
		System.out.println("Commision of employee: "+CommisionEmp.calculateSalary(CommisionEmp.getSalesAmount(),CommisionEmp.getCommisionRate()));

	}

}
