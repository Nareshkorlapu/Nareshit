package com.Nit.OOPs_Task_21_1_Wrapper_classes;

public class PaymentProcessing {
	public static void  paymentGateway(Payment... payments)
	{
		for(Payment payment:payments)
		{
			payment.processPayment();
		}
	}
	public static void main(String[] args) 
	{
		CreditCardPayment c1=new CreditCardPayment();
		DebitCardPayment d1=new DebitCardPayment();
		UPIPayment u1=new UPIPayment();
		paymentGateway(c1,d1,u1);

	}

}
class Payment 
{
	public void processPayment()
	{
		System.out.println("Processing payment.");
	}
}
 class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing credit card payment.");
	}
}
 class DebitCardPayment extends Payment
 {
	 @Override
		public void processPayment()
		{
			System.out.println("Processing debit card payment.");
		}
 }
 class UPIPayment extends Payment
 {
	 @Override
		public void processPayment()
		{
			System.out.println("Processing UPI payment.");
		}
 }

