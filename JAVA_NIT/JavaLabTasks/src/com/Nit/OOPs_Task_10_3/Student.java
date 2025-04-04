package com.Nit.OOPs_Task_10_3;

public class Student {
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Student()
	{
		this.studentId=0;
		this.studentName="Unknown";
		this.studentAge=0;
	}
	
	public Student(int studentId,String studentName,int studentAge)
	{
		this.studentId=studentId;
		 if (studentId < 0) {
	            System.out.println("Error: Student ID cannot be negative.");
	            return;
	        }
		 else {
			 this.studentId=studentId;
		 }
		 
		 this.studentName=studentName;
	        if (studentName.isBlank() || studentName.isEmpty()) {
	            System.out.println("Error: Student name cannot be empty.");
	            return;
	        }
	        else {
	        	this.studentName=studentName;
	        }
		
		
		this.studentAge=studentAge;
	}
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void showDetails()
	{
		System.out.println("Student ID:"+studentId+", Name:"+studentName+", Age:"+studentAge);
	}
}
