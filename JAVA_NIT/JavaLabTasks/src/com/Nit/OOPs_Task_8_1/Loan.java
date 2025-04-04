package com.Nit.OOPs_Task_8_1;

public class Loan {
	double principal;
	private double interestRate;
	private int durationMonths;
	double emi;
	public Loan(double principal, double interestRate, int durationMonths) {
		if(principal>0 && interestRate>0 && durationMonths>0)
		{
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
		}
		else
		{
			System.err.println("Error!");
		}
	}
	
	public double calculateMonthlyPayment()
	{
		double emi =(getPrincipal()*getInterestRate()*getDurationMonths())/100;
		return emi;
	}

	public double getPrincipal() {
		return principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	@Override
	public String toString() {
		return "Loan [principal=" + principal + ", interestRate=" + interestRate + ", durationMonths=" + durationMonths
				+ ", emi=" + calculateMonthlyPayment() + "]";
	}
	
	
	
	
	
	
	
}
