/*Que 1 : Write a 'JavaScript' program to check and print that the given number is even or odd without using ternary operator and control statements and print the output on the console.
--------

Sample input : let a = 10
Sample Output : EVEN

Sample input : let a = 125
Sample Output : ODD*/
var a=16;
var result=(['even','odd'][a%2])
console.log(result);
var b=10;
var result=(['even','odd'][b%2])
console.log(result);

/*Que 2 : Write a 'JavaScript' program to check and print the Maximum number among two numbers without using ternary operator, control statements and predefined methods.
--------

Sample input : let a = 10 , b = 20
Sample Output : MAX = 20*/
var c=10,d=20;
(c>d) && console.log("MAX = "+c);
(c<d) && console.log("MAX = "+d);

/*Que 3 : Write a 'JavaScript' program to check and print the Maximum number among three numbers without using ternary operator, control 	statements and predefined methods.
--------

Sample input : let a = 10 , b = 200, c = 134;
Sample Output : MAX = 200*/
//me
var e=10,f=200,g=134;
(e>(f+g)) && console.log("MAX = "+e);
(f>(g+e)) && console.log("MAX = "+f);
(g>(e+f)) && console.log("MAX = "+g);
//Danny
(e>f) && (e>g) && console.log("MAX = "+e);
(f>g) && (f>e) && console.log("MAX = "+f);
(g>f) && (g>e) && console.log("MAX = "+g);

/*Que 4 :  Write a 'JavaScript' program to check and print the Maximum number among three numbers using ternary operator.
--------

Sample input : let a = 10 , b = 200, c = 134;
Sample Output : MAX = 200*/

var h=10,i=200,j=134;
var res=(h>i) && (h>j)?"MAX ="+h:(i>h) && (i>j)?"MAX ="+i:(j>i) && (j>h)?"MAX ="+j:"min =";
console.log(res);

/*Que 5 :  Write a 'JavaScript' program to check and print that given number is even or odd using ternary operator.
--------

Sample input : let a = 10
Sample Output : EVEN

Sample input : let a = 125
Sample Output : ODD*/

function evenOdd(k){
    var k;
    var res=(k%2==0)?"Even" : "Odd";
    console.log(res)
}
evenOdd(125)
evenOdd(10)

/*Que 6 : A shopkeeper buys a TV set for Rs. 3500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. 
-------  Write a JavaScript program to Display total selling price, profit along with vat and service charge.
         To calculate the selling price, profit, VAT, and service charge, follow these steps:

         1) Calculate the selling price:

            Selling Price = Cost Price + Profit

            Selling Price = Rs. 3500 + (27% of Rs. 3500)


         2) Calculate the profit:

            Profit = Selling Price - Cost Price


         3) Calculate VAT:

            VAT = 12.7% of Selling Price


         4) Calculate Service Charge:

            Service Charge = 3.87% of Selling Price
*/
var price=3500;
var sellPrice=price+(0.27*3500);
var profit=sellPrice-price;
var Vat=0.127*sellPrice;
var servcharge=0.0387*sellPrice;
console.log("Selling price = "+sellPrice)
console.log("Profit = "+profit)
console.log("VAT = "+Vat)
console.log("Service charge= "+servcharge)

/*Que 7 : (Using ternary operator) write a JavaScript program for a bookstore named "Book World" that calculates the discounted amount based on the total purchase amount. 
------  

The store provides three types of discounts to its customers:
-> If the total purchase amount is less than Rs. 1000, there is no discount.
-> If the total purchase amount is between Rs. 1000 and Rs. 5000 (inclusive), customers get a 5% discount on the total purchase amount.
-> If the total purchase amount is greater than Rs. 5000, customers get a 10% discount on the total purchase amount.

Sample input  : purchase amount = 999
Sample output : total amount = 999

Sample input  : purchase amount = 2000
Sample output : total amount including 5% discount = 1900

Sample input  : purchase amount = 10000
Sample output : total amount including 10% discount = 9000
*/

function purchaseamount(p)
{
var p;
var dis1=(0.05*p);
var dis2=(0.1*p);
var ps=(p<1000)?("total amount ="+(p)):(p>=1000 && p<5000)?("total amount= "+(p-dis1)):(p>5000)?("total amount= "+(p-dis2)):"";
console.log(ps)
}
purchaseamount(999);
purchaseamount(2000);
purchaseamount(10000);

/*Que 8 : Develop a program for an online bus ticket booking platform called "Bus Ticket Booker." 
------  The platform offers tickets for a fixed price of Rs. 300 per seat. However, there are discounts available for senior citizens. 
        If a passenger's age is between 60 and 100 (inclusive), they will receive a 20% discount on the total booking cost.

        Write a JavaScript program for "Bus Ticket Booker" that takes the number of tickets and the age of the passenger as inputs and calculates the total booking cost after applying any 	applicable discount using the ternary operator. The program should display the bill with a suitable message, including the total cost and the discount amount (if applicable).

        Your task is to implement the program logic using only Ternary Operator.


Example 1: Passenger is not a senior citizen
Sample Input: 
              number of tickets: 3
              age of the passenger: 45

Sample Output:
              Total cost before discount: Rs. 900.00
              Discount amount: Rs. 0.00
              Total cost after discount: Rs. 900.00


Example 2: Passenger is a senior citizen
Sample Input:
              number of tickets: 2
              age of the passenger: 65

Sample Output:
              Total cost before discount: Rs. 600.00
              Discount amount: Rs. 120.00
             Total cost after discount: Rs. 480.00

*/
function passenger(age,ticket)
{
var age;
var ticket;
var dic=120;
var utp=(age>=60 && age<=100)?"Total cost "+((300*ticket)-dic):(age>=1&&age<60)?"total cost : "+(300*ticket):"no ticket";
console.log(utp);
}
passenger(65,2)
passenger(45,3)

/*Que 9 : Write a C program that takes an integer as input and checks if it is a positive, negative, or zero. 
------- Display the appropriate message as output using the ternary operator.
    

	Sample Input: 
      		enter a number: -1
             

	Sample Output:
		you entered negative number


	Sample Input: 
             	enter a number: 1

	Sample Output:
		you entered positive number

	Sample Input: 
              	enter a number: 0

	Sample Output:
		you entered zero
*/
function number(n)
{
var n;
var sovle=(n==0)?"Zero":(n<0)?"negative number" : "positive number";
console.log(sovle)
}
number(1);
number(-1);
number(0);
