package com.Nit.OOPs_Task_9_1;

public class Student {
	private String name;
	private int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
