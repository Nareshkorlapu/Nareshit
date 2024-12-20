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
function create(){
    amt=+prompt("Enter amount to open acount")
    if(amt<=0){
        alert("Invalid amount")
        create()
    }
    else if(amt<2000){
        alert("Initial deposit not lessthan 2000")
        create()
    }
    else {
        alert("Your account is creates successfully");
        ogacno=dmacno;
        bankin();
    }
}
function dep(){
    if(ogacno==dmacno){
    var dep=+prompt('Enter the amount to deposit');
    if(dep>0){
        amt+=dep;
        alert("Amount deposited successfully")
        alert("amount after depositing is :"+ amt);
        bankin()

    }
    else{
        alert(" Invalid amount to deposit ");
        dep()
    }

    }
    else{
        alert("Create account first");
        bankin();
    }
}
function wtdrw(){
    if(ogacno!=dmacno){
        alert("Create account first");
        bankin();
    }
    else{
    var wt=+prompt("Enter amount to withdraw");
    

    if(wt<=0){
        alert(" Invalid amount to withdraw ");  
        wtdrw();
    }
    else{
        if(amt-wt<2000){
            alert("Insufficient funds");
            bankin();
        }
        else{
            amt-=wt;
            alert(wt+ " Withdrawn successfully");
            alert("Available balance"+ amt);
            bankin()
        }
    }
}
}
function ckbal(){
    if(ogacno!=dmacno){
        alert("Create account first");
        bankin();
    }
    else{
        alert("Available balance is : " + amt);
    }
    
}
function Term(){
    alert("Thanks for banking with us")
    return
}

var opt, amt, dmacno=12354, ogacno=0;
console.log("--- Bank Account Menu ---")
console.log("1. Create Account")
console.log("2. Deposit Money")
console.log("3. Withdraw Money")
console.log("4. Check Balance")
console.log("5. Exit")
bankin()
function bankin(){
    opt=0;
opt=+prompt("enter your option")

if(opt>=1 && opt<=5){
switch(opt){
    case 1: create();break;
    case 2: dep();break;
    case 3: wtdrw();break;
    case 4: ckbal();break;
    case 5: Term();break;
}
}
else {
    alert("Invalid input")
    bankin()
}
}

