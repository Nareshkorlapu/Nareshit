/*1) Write a java program that accepts a number as a command-line argument and prints its multiplication table.
- if number is negative print "Error" message on console. 
*/
public class MultiplicationTable
{
public static void main(String [] args)
{
	int num=Integer.parseInt(args[0]);
	if(num>0)
	{
	for(int i=1;i<10;i++)
	{
	System.out.println(num+"*"+i+"="+(num*i));
	}
}
	else{
	System.out.println("Error");
	}
}
}