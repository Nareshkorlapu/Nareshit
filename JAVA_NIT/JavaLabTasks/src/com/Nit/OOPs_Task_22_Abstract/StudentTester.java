package com.Nit.OOPs_Task_22_Abstract;

public class StudentTester
{
	public static void main(String []args)
	{
		ScienceStudent s1=new ScienceStudent("lok","5",70,90,85);
		System.out.println(s1.getPercentage()+"%");
		ScienceStudent s2=new ScienceStudent("Raj","5",70,90,85);
		System.out.println(s1.getPercentage()+"%");
		System.out.println("Total No of Students :"+ScienceStudent.totalNoOfStudents);
		HistoryStudent h1=new HistoryStudent("nar", "5", 50, 50);
		System.out.println(h1.getPercentage()+"%");
		
	}
}

abstract class Student
{
	protected String studentName;
	protected String studentClass;
	public static int totalNoOfStudents;
	
	abstract public int getPercentage();
	
	public static int getTotalNoStudents()
	{
		return totalNoOfStudents;
	}
	
	public Student()
	{
		
	}
	
	public Student(String studentName, String studentClass) 
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents+=1;
	}
	
	

}

class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	public int getPhysicsMarks() {
		return physicsMarks;
	}



	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	@Override
	public int getPercentage()
	{
		return (this.physicsMarks+this.chemistryMarks+this.mathsMarks)/3;
		
	}
	
}

class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicMarks;
	
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicMarks = civicMarks;
	}
	
	

	public int getHistoryMarks() {
		return historyMarks;
	}



	public int getCivicMarks() {
		return civicMarks;
	}



	@Override
	public int getPercentage() {
		
		return (this.historyMarks+this.civicMarks)/2;
	}
	
	
}