package com.Nit.OOPs_Task_9_1;

public class CalculateStudentGrade {
	public static StudentGrade calculateGrade(Student std)
	{
		int marks = std.getMarks();
		if(marks>90)
		{
			return new StudentGrade(std,'A');
		}
		else if(marks>=75)
		{
			return new StudentGrade(std,'B');
		}
		else if(marks>=60)
		{
			return new StudentGrade(std,'C');
		}
		else
		{
			return new StudentGrade(std,'D');
		}
	}
}
