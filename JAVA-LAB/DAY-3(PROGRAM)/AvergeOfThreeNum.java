/*2)Write a Java program that accepts three numbers as command-line arguments and calculates their average.
- if any number is negative print "Error" message on console.*/
public class AvergeOfThreeNum
{
public static void main(String [] args)
{
float a=Float.parseFloat(args[0]);
float b=Float.parseFloat(args[1]);
float c=Float.parseFloat(args[2]);
if(a>0&&b>0&&c>0)
{
float average=(a+b+c)/3;
System.out.println("Average of three numbers is:"+average);
}
else
{
System.out.println("Error");
}
}
}