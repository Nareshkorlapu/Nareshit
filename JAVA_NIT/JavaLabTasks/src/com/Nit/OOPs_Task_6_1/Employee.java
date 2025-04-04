package com.Nit.OOPs_Task_6_1;

public class Employee
{
    int employeeNumber;
    String employeeName;
    double employeeSalary;

    public Employee(int number,String name,double salary)
    {
        employeeNumber=number;
        employeeName=name;
        employeeSalary=salary;
    }
    
    public void employeeDetails()
    {
        if(employeeSalary>0)
        {
            if(employeeSalary>=60000)
            {
               System.out.println("Employee is a Developer"); 
            }

            else if(employeeSalary>=40000 && employeeSalary<60000)
            {
                System.out.println("Employee is a Designer"); 
            }

            else if(employeeSalary<40000 && employeeSalary>0)
            {
                System.out.println("Employee is a Tester"); 
            }
        
        }
        else
        {
            System.out.println("Salary cannot be negative.");
        }
        
        
    }

    

}
