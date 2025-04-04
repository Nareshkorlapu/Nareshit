/*Q3) Write a program to find out the area of circle by taking the value
    from Command line arguments*/

public class AreaOfCircle
{
public static void main(String [] args){
	final double pi=3.14;
	double radius=Double.parseDouble(args[0]);
	System.out.println("Area of circle is:"+(pi*radius*radius));
	
}
}