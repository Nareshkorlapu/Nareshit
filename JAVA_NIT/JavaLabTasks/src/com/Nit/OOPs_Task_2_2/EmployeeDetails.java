package com.Nit.OOPs_Task_2_2;

public class EmployeeDetails {

	public static void main(String[] args) {
		int i=1;
		while(i<=3)
		{
		Employee empi = new Employee();
		empi.setEmployeeData();
		empi.getEmployeeData();
		
		System.out.println("----------------------------------------------");
		i++;
		}

	}

}
