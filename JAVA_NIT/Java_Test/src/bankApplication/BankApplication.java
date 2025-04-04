package bankApplication;
import java.util.*;
public class BankApplication {

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
			System.out.print("Enter Account number: ");
			String number = sc.nextLine();
			System.out.print("Enter balance : ");
			double bal = sc.nextDouble();
			account = new SavingsAccount(name,number,bal);
			account.displayAccountDetails();
			account.calculateInterest();
			break;
		case 2:
			System.out.print("Enter Account holder name: ");
			name = sc.nextLine();

			System.out.print("Enter Account number: ");
			number = sc.nextLine();

			System.out.print("Enter balance : ");
			bal = sc.nextDouble();

			account = new CurrentAccount(name,number,bal);
			account.displayAccountDetails();
			account.calculateInterest();
			break;
		case 3:
			System.out.print("Enter Account holder name: ");
			name = sc.nextLine();

			System.out.print("Enter Account number: ");
			number = sc.nextLine();

			System.out.print("Enter balance : ");
			bal = sc.nextDouble();

			System.out.print("Enter Term Duration: ");
			int termTime = sc.nextInt();

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

		if(accountHolderName.isBlank()|| accountHolderName.isEmpty())
		{
			System.err.println("Acccount holder name can't be null");
//			return;
		}
		else
		{
			this.accountHolderName = accountHolderName;
		}
		if(accountNumber==null || accountNumber.isEmpty())
		{
			System.err.println("Acccount number  can't be null");
//			return;
		}
		else
		{
			this.accountNumber = accountNumber;
		}
		if(balance<=0)
		{
			System.err.println("Balance can't be zer or negative.");
//			return;
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
//		double finalAmount = balance-interest;
		System.out.println("Interst Rate is: "+interest);
//		System.out.println("Final Amount is: "+finalAmount);
		
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
		OverdraftRate();
	}
	public void OverdraftRate()
	{
	System.out.println("Over Draft Rate is: "+overdraftRate);
	}
	public void displayAccountDetails()
	{
		super.displayAccountDetails();
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
		double interest = ((balance/100)*interestRate)*termTime;
//		double finalAmount = interest*termTime;
		System.out.println("Fixed Deposite Interest for"+termTime+" years RS :"+interest);
	}
	public void displayAccountDetails()
	{
		super.displayAccountDetails();
	}
}
