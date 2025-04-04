//BLC

package com.Nit.OOPs_Task_3_1;

public class Student {
	//BCL 
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	public void setStudentData(int id,String name,int marks)
	{
		studentId=id;
		studentName=name;
		studentMarks=marks;
	}
	public void calculateGrade()
	{
		if(studentMarks>=90)
		{
			studentGrade='A';
		}
		else if(studentMarks>80 && studentMarks<=90)
		{
			studentGrade='B';
		}
		else if(studentMarks>70 && studentMarks<=80)
		{
			studentGrade='C';
		}
		else if(studentMarks>60 && studentMarks<=70)
		{
			studentGrade='D';
		}
		else if(studentMarks>40 && studentMarks<=60)
		{
			studentGrade='E';
		}
		else
		{
			studentGrade='F';
		}
	}
	
	public String dispayDetails()
	{
		return "[name="+studentName+", Student id="+studentId+",Marks="+studentMarks+",Grade="+studentGrade+"]";
	}
}
