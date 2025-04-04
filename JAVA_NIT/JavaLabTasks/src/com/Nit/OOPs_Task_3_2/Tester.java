//ELC

package com.Nit.OOPs_Task_3_2;

public class Tester {

	public static void main(String[] args) {
		Employee E1=new Employee();
		E1.setEmployeeData("John", "Smith", 101, 25000, 22);
		E1.calculateSalary();
		System.out.println(E1.displayDetails());
	}

}
