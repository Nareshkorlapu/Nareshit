/*
1. Problem Statement:
Write a 'JavaScript' program that takes a month number (1-12) as input from the user and prints the number of days in that month using a switch statement. 
If the user enters a number outside the range of 1-12, the program should display an error message.

2. Explanation:
You need to use a switch statement to handle different cases for each month.
For months with 31 days (January, March, May, July, August, October, December), display "31 days".
For months with 30 days (April, June, September, November), display "30 days".
For February (month 2), print "28 or 29 days (depending on leap year)" as February can have 28 or 29 days.
For any invalid month number (not between 1 and 12), print "Invalid month number!".

3. Additional Considerations:
The program should handle user input and validate it using a switch-case structure.
No need for a leap year calculation in this basic program, but mention that leap years affect February’s day count.


Sample input_1  : 3
Sample output_1 : 31 days

Sample input_2  : 2
Sample output_2 : 28 or 29 days (depending on leap year)

Sample input_3  : 11
Sample output_3 : 30 days  */

function month(n)
{
   switch(n)
   {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:     
    console.log("31 days")
    break;
    case 2:
    console.log("28 or 29 days (depending on leap year)")
    break;
    case 4: case 6: case 9: case 11: 
    console.log("30 days")
    break;
    default:console.log("not the month")
   }
}
month(1);
month(12)
month(2);
month(6);


/*Que 2 :
=======

Write a 'JavaScript' program to perform a arithmetic operation on two numbers by using Switch Case. 
Take the operators(+,-,*,/,%) as cases and take the input from the user that what kind of operation user want to do on two number.


Sample input :
Enter num1 :10
Enter num2 :20
Enter operation : *
Sample output :
Multiplication is :200
*/
var n1=10;
var n2=20;
function num(z)
{
    switch(z)
    {
        case '+' : 
        console.log("add" ,(n1 + n2));
        break;
        case '-' : 
        console.log("sub" ,(n1 - n2));
        break;
        case '*' : 
        console.log("mul" ,(n1 * n2));
        break;
        case '/' : 
        console.log("div" ,(n1 / n2));
        break;
        case '%' : 
        console.log("mad" ,(n1 - n2));
        break;
        default : " invalide "
        
    }
}
num('+');
num('-');
num('*');
num('/');
num('%');

/*
Que 3 :
=======

Write a 'JavaScript' program to take user Id as 1001 and Password as 1010. Ask the user to enter his id, if the id is valid 

then ask the user to enter his password ,if the password is correct then print the name of the user, otherwise 

the program will print incorrect Password and if the Id doesn't exits, the program will print Incorrect Id.

develop this program by using Switch case. 
*/
var id=1001;
var ps=1010;
function password(i,p){
if(id==i)
{  
    console.log("enter the password :-"); 

    switch(p)
    {
        case 1010:
            console.log("enter the user name :- DANNY ")
            break;
        default : console.log("<---incorrect Password---> ")
    }
}
    else
      {  
        console.log("<-------invalid id------->");
        }
}
password(1001,1011);
password(1000,1010);
password(1001,1010);