/*Que 1 : Write a 'JavaScript' program to read age of person and check the person is eligible for vote or not using if-else.
-------

Sample input  : Enter your age: 20
Sample output : You are eligible to vote.

Sample input  : Enter your age: 16
Sample output : You are not eligible to vote.
*/

function age(num)
{
    if(num>=18)
        return "You are eligible to vote"
    else
    return "You are not eligible to vote"
}
console.log(age(20))
console.log(age(17))
/*Que 2 : Write a 'JavaScript' program to find maximum between two numbers using if-else.
-------

Sample input  : let a = 100, b = 200
Sample output : 200
*/
var a,b;
function max(a,b)
{
    if(a>b)
        return a
    else
    return b
}
console.log(max(100,200))
console.log(max(300,200))

/*Que 3 : Write a 'JavaScript' program to find maximum between three numbers.
-------

Sample input  : let a = 100, b = 200, c = 300
Sample output : 300
*/
var x,y,z;
function max3(x,y,z)
{
    if(x>y && x>z)
        return x
    else if(y>x && y>z)
        return y
    else
    return z
}
console.log(max3(100,600,300))
/*Que 4 : Write a 'JavaScript' program to check whether a number is negative, positive or zero.
-------

Sample input  : let a = 10
Sample output : positive number

Sample input  : let a = 0
Sample output : zero

Sample input  : let a = -2
Sample output : negative number
*/

function nature(n)
{
    if(n>0)
        return "positive number"
    else if(n<0)
        return "negative number"
    else
    return "zero"
}
console.log(nature(10))
console.log(nature(0))
console.log(nature(-2))
/*Que 5 : Write a 'JavaScript' program to check whether a year is leap year or not.
-------

Sample input  : let year = 2020 || let year = 2000 || let year = 2004
Sample output : leap year

Sample input  : let year = 2001 || let year = 2006
Sample output : not leap year
*/
function leap(year)
{
    if(year%4==0)
        return "leap year"
    else
    return "not leap year"
}
console.log(leap(2020))
console.log(leap(2000))
console.log(leap(2004))
console.log(leap(2001))
console.log(leap(2006))

/*Que 6 : Write a 'JavaScript' program to check whether the string is uppercase or lowercase alphabet.
-------

Sample input  : let str = 'A';
Sample output : Uppercase

Sample input  : let str = 'b';
Sample output : Lowercase
*/
function alpha(ch)
{
    if(ch>='A' && ch<='Z')
        return "Uppercase"
    else if(ch>='a' && ch<='z')
        return "lowercase"
    else
    return "special character"
}
console.log(alpha('A'))
console.log(alpha('b'))
/*Que 7 : Rajesh bought an old TV for 3500 RS. and Rajesh sold the TV for 7000 RS, which includes a 5% VAT and a 10% tax on the selling 	price. 
-------  Calculate the net selling price by removing VAT and tax.
         Determine whether Rajesh made a profit or incurred a loss, and calculate the respective amount.

         Program Requirements:

         The program should read the cost price and the total selling price (including VAT and tax).
         The program should calculate the net selling price by removing VAT and tax.
         The program should compare the net selling price with the cost price to determine profit or loss.
         The program should display the amount of profit or loss.

Sample input  : Enter the cost price of the TV: 3500
                Enter the selling price of the TV (including VAT and tax): 7000
Sample output : You made a profit of 1956.52
*/
var p=3500,sp=7000;
var vat=0.05*7000;
var tax=0.1*7000;
var profit=sp-(vat+tax)-p;
console.log("You made a profit of "+profit)

