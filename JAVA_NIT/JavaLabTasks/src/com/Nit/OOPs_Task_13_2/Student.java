package com.Nit.OOPs_Task_13_2;

public class Student {

	int studentId;
	String name;
	double examFee;
	
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public String displayDetails()
	{
		return "Student [name="+this.name+"\n,studentId="+this.studentId+"\n,examFee="+this.examFee+"]";
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	public double payFee(double amount)
	{
		double totalFee = examFee;
		double remainingAmt=totalFee-amount;
		if(totalFee == 0)
		{
			System.out.println("All Fees are clear");
		}
		else
		{ 
			
			System.out.println("Remaining amount to pay is:"+remainingAmt);
		}
		return remainingAmt;
	}
	
	
}
