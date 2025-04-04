package com.Nit.Test_03_02_25_EmployeeInfo;

import java.util.*;
public class EmployeeInfo
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int employeeID=sc.nextInt();
        sc.nextLine();
        String employeeName=sc.nextLine();
        double employeeSalary=sc.nextDouble();

        Employee e1=new Employee(employeeID,employeeName,employeeSalary);
        e1.getEmployeeObject();
        sc.close();
    }
}

class Employee
{
     int employeeID;
     String employeeName;
     double employeeSalary;

     public Employee(int employeeID,String employeeName,double employeeSalary)
     {
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
     }

     public void getEmployeeObject()
     {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+employeeSalary);
     }
}
