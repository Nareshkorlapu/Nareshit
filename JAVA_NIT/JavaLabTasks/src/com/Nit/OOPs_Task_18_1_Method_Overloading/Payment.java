package com.Nit.OOPs_Task_18_1_Method_Overloading;

public class Payment {

	public void makePayment(double amount)
	{
		if(validateAmount(amount))
		{
		System.out.println("Processing payment via Cash...");
		System.out.println("Amount Paid RS :" + amount);
		System.out.println("Payment Successfully!");
		}
		
	}
	
	public void makePayment(String cardHolderName,String creditCardNumber,double amount)
	{
		if(validateAmount(amount) && validateCardNumber(creditCardNumber))
		{
		System.out.println("Card Holder: "+cardHolderName);
		System.out.println("Card Number: "+maskCardNumber(creditCardNumber));
		System.out.println("Amount Paid rs : "+amount);
		System.out.println("Payment Successfully!");
		}
	}
	
	public void makePayment(String debitCardNumber,double amount)
	{
		if(validateAmount(amount) && validateCardNumber(debitCardNumber))
		{
		System.out.println("Card Number: "+maskCardNumber(debitCardNumber));
		System.out.println("Amount Paid RS: "+amount);
		System.out.println("Payment Successfully!");
		}
	}
	
	private boolean validateAmount(double amount)
	{
		if(amount>0)
		{
			
			return true;
		}
		else
		{
			System.err.println("Error! amount must be positive");
			return false;
			
		}
	}
	
	private boolean validateCardNumber(String cardNumber)
	{
		if(cardNumber.length()==16)
		{
			return true;
		}
		else
		{
			System.err.println("Error! Invalid card number. It must be 16 digits");
			return false;
		}
	
	}
	
	private String maskCardNumber(String cardNumber) {
	    
	    if (cardNumber == null || cardNumber.length() < 4) 
	    {
	        return "Invalid card number"; 
	    }

	    
	    String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
	    return masked;
	}

}
