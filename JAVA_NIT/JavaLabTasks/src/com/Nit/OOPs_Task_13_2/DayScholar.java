package com.Nit.OOPs_Task_13_2;

public class DayScholar extends Student {

	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	public String displayDetails()
	{
		return "DayScholar[Transport Fee="+this.transportFee+"\n, name="+this.name+"\n,studentId="+this.studentId+",examFee="+this.examFee+"]" ;
	}
	

	@Override
	public String toString() {
		return "Day Scholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ",Transport Fee="+transportFee+"]";
	}
	
	public double payFee(double amount)
	{
		double totalFee = examFee+transportFee;
		double remainingAmt = amount-totalFee;
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
