/*Q5) Write a Java program to calculate the factorial of a number where number must be taken from command line argument.*/

public class FactorialOfNum
{
public static void main(String [] args)
{
	int num=Integer.parseInt(args[0]);
	int fact=1;
	while(num>1)
{
	fact=fact*num;
	num--;
}

	System.out.println("Factorial of number is:"+fact);
}
}