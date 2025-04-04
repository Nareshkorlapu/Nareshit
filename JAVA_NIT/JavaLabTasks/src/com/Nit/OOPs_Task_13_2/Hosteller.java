package com.Nit.OOPs_Task_13_2;

public class Hosteller extends Student {

	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	
	public String displayDetails()
	{
		return "Hosteller [Hostel Fee="+this.hostelFee+"\n, name="+this.name+"\n,studentId="+this.studentId+"\n,examFee="+this.examFee+"]" ;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ",Hostel Fee="+hostelFee+"]";
	}
	
	public double payFee(double amount)
	{
		double totalFee = examFee+hostelFee;
		double remainingAmt = totalFee-amount;
		if(totalFee == (examFee+hostelFee))
		{
			System.out.println("All Fees are clear");
		}
		else
		{
			System.out.println(" Remaining amount to pay is"+remainingAmt);
			
		}
		return remainingAmt;
	}
	
}
