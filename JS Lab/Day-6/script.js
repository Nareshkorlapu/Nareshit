/*Que 1 :
=======

Write a simple 'JavaScript' program that reads an integer from the user and prints the multiplication table of the given number using a while loop.

Example :

Sample input : N = 7

Sample output :

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
.....
.....
7 x 10 = 70
*/
var n,i=0,a=0;
function table(n)
{
    while(i<10)
    {
        i++;
        a=n*i;
        console.log(n+"X"+i+"="+a);
    }
}
/*table(n=prompt("Enter the number"))*///used for taking input from user
table(7)

/*Que 2 :
=======

Write a 'JavaScript' program that reads a positive integer N from the user and calculates the sum of even and odd numbers between 1 and N using a while loop. 
The program should print the sum of even numbers and the sum of odd numbers.

NOTE : If user entered negative input then print "Invalid Input" message.


Example_1 :

Sample input  : N = -10;

Sample output : Invalid Input

---------------------

Example_2 :

Sample input  : N = 10;

Sample output : even sum => 30 
                odd sum  => 25
*/
var N,j=0,esum=0,osum=0;
function isEsumOsum(N)
{
    if(N>0)
    {
        while(N>j)
        {
            j++;
            if(j%2==0)
            {
                esum+=j;
            }
            else{
                osum+=j;
            }
        }
        console.log("Even sum="+esum)
        console.log("Odd sum="+osum)
    }
    else{
        console.log("Invalid input")
    }
}
//isEsumOsum(N=(prompt("Enter the number")))//user input
isEsumOsum(10)
/*Que 3 :
=======

Write a 'JavaScript' program that reads an integer from the user and prints the count of digits in the given number. 
The program should handle both positive and negative numbers if the number is negative it should print 'negative number' and if the number is zero it should print 'zero'.

Example :

Sample input1  : 12348
Sample output1 : 5

Sample input1  : 0
Sample output1 : zero

Sample input1  : -1
Sample output1 : negative number
*/
var n,count=0;
function countNum(n)
{
    if(n<0)
        console.log("negative number")
    else if(n==0)
        console.log("zero")
    else{
        while(n!=0)
    {
        var c=(n%10)
        count++;
        n=Math.floor(n/10)
    }
    console.log("Count="+count)
}

}
// countNum(n=(prompt("Enter n value"))) ==user input
countNum(12345)
/*Que 4 :
=======

Write 'JavaScript' program to reverse a number using while 

Sample input  : Enter a number : 12345
Sample output : Reverse : 54321
*/
let num1 = 123456789;
let result = num1.toString().split('').reverse().join('');
console.log(result);
