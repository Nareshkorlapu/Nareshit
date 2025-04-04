package com.Nit.OOPs_Task_24_Abstract;
import java.util.*;
public class ProductStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type: ");
		System.out.println("1. Digital Product");
		System.out.println("2. Physical Product");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option)
		{
		case 1:
			System.out.print("Enter Digital Product Name :");
			String Pname = sc.nextLine();
			System.out.print("Enter Product Price :");
			double price = sc.nextDouble();
			System.out.print("Enter Product Category :");
			String cat = sc.nextLine();
			cat=sc.nextLine();
			System.out.print("Enter Product License Key :");
			String PLiKey = sc.nextLine();
			
			if(Pname==null||Pname.isEmpty())
			{
				System.err.println("Product name cannot be empty or null.");
			}
			else if(price<0)
			{
				System.err.println("Price cannot be negative.");
			}
			else if(cat==null||cat.isEmpty())
			{
				System.err.println("Category cannot be empty or null.");
			}
			else
			{
				System.out.println("Digital Product :");
				Product p = new DigitalProduct(Pname, price, cat, PLiKey);
				System.out.println(p);
				p.applyDiscount(10);
				System.out.println("TAX RS : "+p.calculateTax());
			}
			
			break;
		case 2:
			System.out.print("Enter Digital Product Name :");
			Pname = sc.nextLine();
			System.out.print("Enter Product Price :");
			price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter Product Category :");
			cat = sc.nextLine();
//			sc.nextLine();
			System.out.print("Enter Product weight :");
			double pWeight = sc.nextDouble();
			if(Pname==null||Pname.isEmpty())
			{
				System.err.println("Product name cannot be empty or null.");
			}
			else if(price<0)
			{
				System.err.println("Price cannot be negative.");
			}
			else if(cat==null||cat.isEmpty())
			{
				System.err.println("Category cannot be empty or null.");
			}
			else
			{
				System.out.println("Physical Product: ");
				PhyscialProduct Pp = new PhyscialProduct(Pname, price, cat, pWeight);
				System.out.println(Pp);
				Pp.applyDiscount(15);
				System.out.println("TAX RS: "+Pp.calculateTax());
				System.out.println("Shipping Cost RS :"+Pp.calculateShippingCost());
			}
			
			break;
		default:
			System.out.println("Invalid input. Please enter valid input");
			
		}

	}

}
abstract class Product
{
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product Name:" + name + "\nCategory: " + category + "\nPrice RS:" + price ;
	}
	
}
class DigitalProduct extends Product
{
	private String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}
	@Override
	public void applyDiscount(double percentage)
	{
		double discount = getPrice()*(percentage/100);
		setPrice(getPrice()-discount);
		System.out.println("Discount applied : "+discount);
		System.out.println("New Price : "+getPrice());
	}
	@Override
	public double calculateTax()
	{
//		return ((getPrice()-getPrice()*0.1))*0.05;
		return 0.05*getPrice();
	}
	@Override
	public String toString() {
		return super.toString()+"\nLicense Key: "+licenseKey;
	}
	
}
class PhyscialProduct extends Product
{
	private double shippingWeight;

	public PhyscialProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
	@Override
	public void applyDiscount(double percentage)
	{
		double discount = getPrice()*(percentage/100);
		setPrice(getPrice()-discount);
		System.out.println("Discount appiled : "+discount);
		System.out.println("New Price is : "+getPrice());
	}
	@Override
	public double calculateTax()
	{
		return 0.08*getPrice();
	}
	public double calculateShippingCost()
	{
		return shippingWeight*5;
	}
	@Override
	public String toString() {
		return super.toString()+"\nShipping Weight: "+shippingWeight+" kg";
	}
	
}
