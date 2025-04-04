/*5)Write a Java program that accepts a single integer n as a command-line argument and calculates the sum of all odd and even numbers from 1 to n (inclusive). Display the results separately for odd and even sums. 

input : 10 
output :
Sum of even numbers from 1 to 10: 30
Sum of odd numbers from 1 to 10: 25
*/
public class EvenSumOddSum
{
public static void main(String [] args)
{
	int num=Integer.parseInt(args[0]);
	int EvenSum=0,OddSum=0;
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			EvenSum+=i;
		}
		else
		{
			OddSum+=i;
		}
	}
	System.out.println("Sum of even numbers from 1 to "+num+":"+EvenSum);
	System.out.println("Sum of odd numbers from 1 to "+num+":"+OddSum);
}
}