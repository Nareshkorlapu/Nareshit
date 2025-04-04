package com.Nit.OOPs_Task_17_1;

import java.util.*;
public class Main {

	public static void main(String[] args) {
//		Address a1 = new Address("Moosapet", "Hyderabad", "Telangana");
//		Employee e1 = new Employee(101, "Naresh", a1);
//		System.out.println(e1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter City Name: ");
		String cityName = sc.nextLine();
		System.out.print("Enter District Name: ");
		String districtName = sc.nextLine();
		System.out.print("Enter State Name: ");
		String stateName = sc.nextLine();
		Address address = new Address(cityName, districtName, stateName);
		System.out.print("Enter Employee ID: ");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String employeeName = sc.nextLine();
		Employee employee = new Employee(employeeId, employeeName, address);
		System.out.println(employee);

	}

}

class Address
{
	private String cityName;
	private String distictName;
	private String stateName;
	public Address(String cityName, String distictName, String stateName) {
		super();
		this.cityName = cityName;
		this.distictName = distictName;
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "cityName=" + cityName + "\ndistictName=" + distictName + "\nstateName=" + stateName ;
	}
	
}
class Employee
{
	private int empId;
	private String empName;
	private Address address;	//Has-A relation
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee\n------------------------ \nempId=" + empId + "\nempName=" + empName + "\nAddress\n*******************\n" + address ;
	}
	
}