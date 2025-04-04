package com.Nit.OOPs_Task_14_1;

public class PermanentEmployee extends Employee {
	protected double providentFund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		this.providentFund = employeeSalary*0.12;
	}

	
	
	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentFund=" + providentFund + "]";
	}



	public void netSalary()
	{
		System.out.println("Net Salary:"+(employeeSalary+providentFund));
	}
	
	
	
	
	
	
	

}
