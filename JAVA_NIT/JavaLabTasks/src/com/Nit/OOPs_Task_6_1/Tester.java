package com.Nit.OOPs_Task_6_1;

import java.util.*;
public class Tester{
    public static void main(String [] args){
    	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee number: ");
        int employeeNumber=sc.nextInt();
        System.out.print("Enter the employee name: ");
        String employeeName=sc.nextLine();
        employeeName=sc.nextLine();
        System.out.print("Enter employee salary: ");
        double employeeSalary=sc.nextDouble();
        Employee emp=new Employee(employeeNumber, employeeName, employeeSalary);
        emp.employeeDetails();
        sc.close();
    }
}
