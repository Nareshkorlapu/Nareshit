package com.Nit.Test_15_02_25_Employee;

public class EmployeeBLC{
    int employeeNumber;
    String employeeName;
    double employeeSalary;
    double salaryIncrement;
    double updatedSalary;
    public void setEmployeeDetails(int enumb, String ename, double esal){
        employeeNumber=enumb;
        employeeName=ename;
        employeeSalary=esal; 
    } 
    public void calculateSalaryIncrement(){
        if(employeeSalary<50000){
            salaryIncrement=employeeSalary*0.1;
        }
        else if(employeeSalary>=50000 && employeeSalary<=80000){
            salaryIncrement=employeeSalary*0.07;
        }
        else {
            salaryIncrement=employeeSalary*0.05;
        }
        updatedSalary=employeeSalary+salaryIncrement;
    }
    public void getEmployeeDetails(){
    	System.out.println("---------------------------------------------");
    	System.out.println("Employee Details");
        System.out.println("Employee Number: "+employeeNumber);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+employeeSalary);
        System.out.println("Salary increment amount: "+salaryIncrement);
        System.out.println("Updated salary: "+updatedSalary);
    }
}
