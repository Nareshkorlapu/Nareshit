//BLC

package com.Nit.OOPs_Task_3_2;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setEmployeeData(String fname,String lname,int eid,double sal,int nproject)
	{
		firstName=fname;
		lastName=lname;
		employeeId=eid;
		salary=sal;
		noOfProject=nproject;
	}
	
	public void calculateSalary()
	{
		if(noOfProject>20)
		{
			salary=salary+15000;
		}
		else if(noOfProject>10 && noOfProject<=20)
		{
			salary=salary+10000;
		}
		else if(noOfProject>=5 && noOfProject<=10)
		{
			salary=salary+5000;
		}
		else
		{
			salary=salary+0;
		}
	}
	
	public String displayDetails()
	{
		return "[First name="+firstName+
				",Last name="+lastName+
				",Id="+employeeId+
				",Salary="+salary+
				",Number of projects="+noOfProject+"]";
	}
}
