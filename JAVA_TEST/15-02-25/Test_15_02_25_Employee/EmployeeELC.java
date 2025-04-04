package com.Nit.Test_15_02_25_Employee;


import java.util.*;
public class EmployeeELC{
    public static void main(String [] args){
        EmployeeBLC emp=new EmployeeBLC();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        int enumb=sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String ename=sc.nextLine();
        ename=sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double esal=sc.nextDouble();
        if(enumb<0){
            System.out.println("Invalid Employee ID");
        }
        else if(esal<0){
            System.out.println("Invalid salary");
        }
        else{
        emp.setEmployeeDetails(enumb, ename, esal);
        emp.calculateSalaryIncrement();
        emp.getEmployeeDetails();
        }
        sc.close();
    }
}
