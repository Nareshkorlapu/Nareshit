package DescriptionOfMainMethod;

public class StaticMethodDemo2 {
	public static void main(String[] args)
	{
		Hello.greet();
		System.out.println("Hello Batch 42 and 43!!!");
	}
}

class Hello
{
	public static void greet()
	{
		System.out.println("Hello Everyone!!");
	}
}
