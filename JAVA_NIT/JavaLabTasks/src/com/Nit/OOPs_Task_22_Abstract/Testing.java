package com.Nit.OOPs_Task_22_Abstract;

import java.util.Scanner;

public class Testing
{
	public static void main(String[] args)
	{
		
		Food f=null;
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("How many food items you want: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter the Type of Food");
			String type=sc.nextLine();
			type=sc.nextLine();
			System.out.println("Enter the Protiens: ");
			double pro=sc.nextDouble();
			System.out.println("Enter the fats: ");
			double fats=sc.nextDouble();
			System.out.println("Enter the carbs: ");
			double carbs=sc.nextDouble(); 
			
			if(type.equals("non-veg"))
			{
				f=new Egg(pro, fats, carbs);
			}
			else if(type.equals("veg"))
			{
				f=new Bread(pro, fats, carbs);
			}
			else
			{
				System.out.println("Invalid input type! Please enter veg or non-veg");
			}
				
			f.getMarcoNutrients();
			
		}
		sc.close();
	}
}
abstract class Food
{
	double protiens;
	double fats;
	double carbs;
	double tastyScore;
	
	public abstract void getMarcoNutrients();
}
class Egg extends Food
{
	int tastyScore=7;
	String type = "non-vegetarian";
	public Egg(double protiens,double fats,double carbs)
	{
		this.protiens = protiens;
		this.fats = fats;
		this.carbs = carbs;
	}
	public void getMarcoNutrients()
	{
		System.out.println("Food type: "+type);
		System.out.println("An egg has"+this.protiens+"gms of protien,"+this.fats+"gms of fats and "+this.carbs+"gms of carbohydrates,Taste : "+tastyScore);
	}
	
}
class Bread extends Food
{
	int tastyScore=8;
	String type = "vegetarian";
	public Bread(double protiens,double fats,double carbs)
	{
		this.protiens = protiens;
		this.fats = fats;
		this.carbs = carbs;
	}
	public void getMarcoNutrients()
	{
		System.out.println("Food Type: "+type);
		System.out.println("A slice of bread has"+this.protiens+"gms of protien,"+this.fats+"gms of fats and "+this.carbs+"gms of carbohydrates,Taste :"+tastyScore);
	}
}
