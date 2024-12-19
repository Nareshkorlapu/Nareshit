/*Que : Develop a 'JavaScript' program that simulates a simple bank account system. Users can create accounts, deposit money, withdraw money, and check their balances. Implement separate functions for these operations. Take the initial balance as Rs.2000.
--------

-> create a function bankApplication()
	-> parameters : none
	-> no return 
	
	-> this will be your main function. from this function only your bank application will start this function display bank menu to the user and based on the users choice it will 		   execute the rest of the functions.
	-> when user chooses 5 as exit it will display a message " Thank you for banking with us " and stops the program.
	-> when user chooses the 1 as create account it will prompt user to enter account number then it will call createAccount() function for next execution.

	-> validations :
		-> validate the user input either he chooses the option from 1-5 only otherwise alert user "invalid option" and call bankApplication() again.
		-> validate the accountNumber that user enters only numeric value. 

-> create a createAccount() function
	-> parameters : none
	-> no return
	
	-> this function will prompt the user to enter the initial amount to open a bank account.

	-> validations : 
		-> validate that the initial amount is non-negative and non-zero alert user " enter valid amount " if user enter negative or zero and call createAccount() again.
		-> validate that the user enter amount > 2000 otherwise alert user " the initial amount is minimum 2000 " and call createAccount() again.
		-> on success it will alert user " your account is created successfully, your account number is ${accountNumber} " 

-> create a function depositeMoney()
	-> parameters : none
	-> no return

	-> this function will prompt the user to " enter amount to deposit " to deposit money into account.

	-> Validations:
		-> validate that while user chooses this option the account number is not 0 otherwise alert user " please create account first " and call bankApplication().
		-> validate that the deposit amount is non-negative and non-zero alert user " Invalid amount to deposit " if user enter negative or zero and call depositeMoney() again.
		-> on success it will alert user " Rs. ${amt} deposited successfully. Your current balance is: Rs. ${amount} " 
 
-> create a function withdraw()
	-> parameters : none
	-> no return

	-> this function will prompt the user to " enter amount to withdraw " to withdraw a money from account.

	-> Validations:
		-> validate that while user chooses this option the account number is not 0 otherwise alert user " please create account first " and call bankApplication().
		-> validate that the withdrawal amount is non-negative and non-zero alert user " Invalid amount to withdraw " if user enter negative or zero and call withdraw() again.
		-> validate that the intial amount 2000 is fixed user cannot withdraw the money when it is 2000 if user enter the amt greater than initial balance or user entered 
		   (amt-balance) is less than 2000 alert user "Insufficient Funds" 
		-> on success it will alert user " Rs. ${amt} withdrawn successfully. Your current balance is: Rs. ${amount} " 
 
-> create a function checkBalance()
	-> parameters : none
	-> no return

	-> this function will alert user " account number ${accountNumber} total balance ${amount}.

	-> Validations:
		-> validate that while user chooses this option the account number is not 0 otherwise alert user " please create account first " and call bankApplication().
		-> on success it will display "Your current balance is: Rs. ${amount}"

SAMPLE INPUT AND SAMPLE OUTPUT :
--------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 1

 your account is created successfully, your account number is ${accountNumber}
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 2

Enter amount to deposit: 1500

Rs. 1500 deposited successfully.
Your current balance is: Rs. 3500
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 2

Enter amount to deposit: -500

Invalid amount to deposit
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 3

Enter amount to withdraw: 1000

Rs. 1000 withdrawn successfully.
Your current balance is: Rs. 2500
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 3

Enter amount to withdraw: -300

Invalid amount to withdraw
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 3

Enter amount to withdraw: 3000

Insufficient Funds
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 4

Your current balance is: Rs. 2500
-------------------------------------------------------

--- Bank Account Menu ---
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
Enter your choice: 5

Thank you for banking with us.

===========================================================================================================================
*/
var opt,damt,wamt;
function bankApplication()
{
    function menu()
    {
        console.log("=========Bank Account Menu=======");
        console.log("1.Create Account");
        console.log("2.Deposite Money");
        console.log("3.Withdraw Money");
        console.log("4.Check Balanace");
        console.log("5.Exit");
    }
    menu()
   function swit()
    {
        switch(opt)
        {
        case 1:
            createAccount();
            break;
        case 2:
            depositeMoney();
            break;
        case 3:
            withdrawMoney();
            break;
        case 4:
            checkBalance();
            break;
        case 5:
            exit();
            break;
        }
        
    }
    swit(opt=Number(prompt("Enter your option: ")))
}
bankApplication()
function createAccount()
{
    alert("Your account is created successfully, your account number is ${accountNumber()}");
   menu()
}
function depositeMoney(damt)
{
    alert("Rs: "+damt+"  deposite successfully.");
    alert("Your current balance is: Rs. "+damt);
    menu()
}
depositeMoney(damt=Number(prompt("Enter amount to deposite:")))

function withdrawMoney(wamt)
{

}
function checkBalance()
{

}
function exit()
{
    alert("Thank you for banking with us")
}


