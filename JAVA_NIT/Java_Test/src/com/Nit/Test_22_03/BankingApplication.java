package com.Nit.Test_22_03;
import java.util.*;
public class BankingApplication {

	public static void main(String[] args) {
		BankAccount account = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the type of Bank Account is:[1/2/3]");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("3.Fixed Deposite Account");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option)
		{
		case 1:
			System.out.print("Enter Account holder name: ");
			String name = sc.nextLine();
			if(name.isBlank()||name.isEmpty())
			{
				System.err.println("Error! Account number can't ne null.");
				return;
			}
			System.out.print("Enter Account number: ");
			String number = sc.nextLine();
			if(number.isBlank()||number.isEmpty())
			{
				System.err.println("Error! Account number can't be null.");
				return;
			}
			System.out.print("Enter balance : ");
			double bal = sc.nextDouble();
			if(bal<0)
			{
				System.err.println("Balance can't be negative.");
				return;
			}
			account = new SavingsAccount(name,number,bal);
			account.displayAccountDetails();
			account.calculateInterest();
			break;
		case 2:
			System.out.print("Enter Account holder name: ");
			name = sc.nextLine();
			if(name.isBlank()||name.isEmpty())
			{
				System.err.println("Error! Account number can't ne null.");
				return;
			}
			System.out.print("Enter Account number: ");
			number = sc.nextLine();
			if(number.isBlank()||number.isEmpty()||number.length()!=16)
			{
				System.err.println("Error! Account number can't be null.");
				return;
			}
			System.out.print("Enter balance : ");
			bal = sc.nextDouble();
			if(bal<0)
			{
				System.err.println("Balance can't be negative.");
				return;
			}
			account = new CurrentAccount(name,number,bal);
			account.displayAccountDetails();
			account.calculateInterest();
			break;
		case 3:
			System.out.print("Enter Account holder name: ");
			name = sc.nextLine();
			if(name.isBlank()||name.isEmpty())
			{
				System.err.println("Error! Account number can't ne null.");
				return;
			}
			System.out.print("Enter Account number: ");
			number = sc.nextLine();
			if(number.isBlank()||number.isEmpty())
			{
				System.err.println("Error! Account number can't be null.");
				return;
			}
			System.out.print("Enter balance : ");
			bal = sc.nextDouble();
			if(bal<0)
			{
				System.err.println("Balance can't be negative.");
				return;
			}
			System.out.print("Enter Term Duration: ");
			int termTime = sc.nextInt();
			if(termTime<0)
			{
				System.err.println("Term Time can't ne negative.");
				return;
			}
			account = new FixedDepositeAccount(name,number,bal,termTime);
			account.displayAccountDetails();
			account.calculateInterest();
			break;
			default:
				System.out.println("Invalid type entered. Please enter valid type");
		}
		sc.close();

	}

}
class BankAccount
{
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE = "SBI0802553";
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		super();
		if(accountHolderName.isBlank()|| accountHolderName.isEmpty())
		{
			System.err.println("Acccount holder name can't be null");
			return;
		}
		else
		{
			this.accountHolderName = accountHolderName;
		}
		if(accountNumber==null || accountNumber.isEmpty()||accountNumber.length()!=16)
		{
			System.err.println("Acccount number  can't be null");
			return;
		}
		else
		{
			this.accountNumber = accountNumber;
		}
		if(balance<=0)
		{
			System.err.println("Balance can't be zer or negative.");
			return;
		}
		else
		{	
			this.balance = balance;
		}
	}
	public void calculateInterest()
	{
		System.out.println("Normal Account doesn't have any interest");
	}
	public void displayAccountDetails()
	{
		System.out.println("Account Holder Name is: "+accountHolderName);
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Balance is: "+balance);
		System.out.println("Bank IFSC CODE: "+IFSC_CODE);
	}
	
}

class SavingsAccount extends BankAccount
{
	protected double interestRate = 4.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}
	public void calculateInterest()
	{
		double interest = (balance/100)*interestRate;
		double finalAmount = balance-interest;
		System.out.println("Interst Rate is: "+interest);
		System.out.println("Final Amount is: "+finalAmount);
		
	}
	@Override
	public void displayAccountDetails()
	{
		super.displayAccountDetails();
	}
	
}
class CurrentAccount extends BankAccount
{
	protected double overdraftRate = 5000.0;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}
	public void calculateInterest()
	{
		super.calculateInterest();
	}
//	public void OverdraftRate()
//	{
//		System.out.println("Over Draft Rate is: "+overdraftRate);
//	}
	public void displayAccountDetails()
	{
		System.out.println("Account Holder Name is: "+accountHolderName);
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Balance is: "+balance);
		System.out.println("Over Draft Rate is: "+overdraftRate);
		System.out.println("Bank IFSC CODE: "+IFSC_CODE);
		
	}
	
}
class FixedDepositeAccount extends BankAccount
{
	protected double interestRate = 6.5;
	protected int termTime;
	public FixedDepositeAccount(String accountHolderName, String accountNumber, double balance, int termTime) {
		super(accountHolderName, accountNumber, balance);
		if(termTime<0)
		{
			System.err.println("Error! Term Time can't be negative.");
			return;
		}
		else
		{
			this.termTime = termTime;
		}
	}
	public void calculateInterest()
	{
		double interest = (balance/100)*interestRate;
		double finalAmount = (balance-interest)*termTime;
		System.out.println("Interest is: "+interest);
		System.out.println("Final Amount is: "+finalAmount);
	}
	public void displayAccountDetails()
	{
		super.displayAccountDetails();
		System.out.println("Term Time is: "+termTime);
	}
}
