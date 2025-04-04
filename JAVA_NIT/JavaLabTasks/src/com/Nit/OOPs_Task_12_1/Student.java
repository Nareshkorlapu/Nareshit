package com.Nit.OOPs_Task_12_1;

public class Student {
	private String name;
	private int id;
	private String course;
	private char grade;
	private double fee;
	
	private double average;
	
	public Student(String name,int id,String course,double fee,double average)
	{
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
		if(average>0)
		{
			this.average=average;
		}
		else
		{
			System.err.println("\"Error: Average mark must be between 0 and 100.\"");
		}
	}
	
	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.course = s.course;
		this.fee = s.fee;
		this.grade = s.grade;
		if(average>0)
		{
			this.average=s.average;
		}
		else
		{
			System.err.println("\"Error: Average mark must be between 0 and 100.\"");
		}
	}
	
	public char calculateGrade()
	{
		if(average>=90)
		{
			return grade='A';
		}
		else if(average>=80)
		{
			return grade = 'B';
		}
		else if(average>=70)
		{
			return grade = 'C';
		}
		else if(average>=60)
		{
			return grade = 'D';
		}
		else
		{
			return grade = 'F';
		}
	}

	@Override
	public String toString() {
		return "Student [Grade for average " + average + ":" + calculateGrade() + "]";
	}

	
	
}
