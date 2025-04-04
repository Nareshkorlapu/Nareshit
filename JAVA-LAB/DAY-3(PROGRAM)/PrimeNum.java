/*
3)Write a Java program that accepts a single integer as a command-line argument and checks whether it is a prime or not.
- if number is negative print "Error" message on console.
*/
public class PrimeNum
{
public static void main(String [] args)
{
int num=Integer.parseInt(args[0]);
int count=0;
	if(num>0)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not Prime");
			}
	}
	else
	{
		System.out.println("Error");
	}
}
}