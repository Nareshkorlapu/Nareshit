/*
4)Write a Java program that accepts a single integer as a command-line argument and prints the first n numbers of the Fibonacci series.
- if arguments length is 0 print "Error" message on console.
*/
public class FibonacciSeries
{
public static void main(String[] args)
{
	int num=Integer.parseInt(args[0]);
	int a=0,b=1;
	System.out.println("Fibonacci series of"+num+"is:");
	if(num>0)
	{
		for (int i = 1; i <= num; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
	}
	else
	{
		System.out.println("Error");
	}
}
}
