package MCQs;

import java.util.*;
public class ProductStore{
	 public static void main(String[] args) {
		 System.out.println("MENU");
		 System.out.println("Select Product Type: ");
		 System.out.println("1.Digital Product");
		 System.out.println("2.Physical Product");
		 Scanner sc = new Scanner(System.in);
		 int option = sc.nextInt();
		 sc.nextLine();
		 switch(option){
			 case 1:
				System.out.println("Enter Digital Product Name : ");
			 String name= sc.nextLine();
			 System.out.println("Enter Product price :");
			 double price = sc.nextDouble();
			 sc.nextLine();
			 System.out.println("Enter Product Category : ");
			 String category = sc.nextLine();
			 System.out.println("Enter product LicenseKey : ");
			 String LicenseKey = sc.nextLine();
			 System.out.println("Digital Product : ");
			 Product p1 = new DigitalProduct(name,price,category,LicenseKey);
			 System.out.println(p1);
			 p1.applyDiscount(10);
			 System.out.println("TAX RS: "+p1.calculateTax());
			 break;
		 case 2:
			 System.out.println("Enter Physical Product Name :");
			 String name1 =sc.nextLine();
			 System.out.println("Enter Product Price :");
			 double Price2= sc.nextDouble();
			 System.out.println("Enter Product Category :");
			 String category2 = sc.nextLine();
			 sc.nextLine();
			 System.out.println("Enter Product weight :");
			 double shippingWeight = sc.nextDouble();
			 System.out.println("Physical Product:");
			 PhysicalProduct p2 = new PhysicalProduct(name1,Price2,category2,shippingWeight);
			 System.out.println(p2);
			 p2.applyDiscount(15);
			 System.out.println("TAX RS: "+p2.calculateTax());
			 System.out.println("Shipping Cost RS: "+p2.calculateShippingCost());
			 break;
		default:
			System.out.println("Invalid input, Enter valid type product");
		 
	 
		 	 
		 
		 }
	 
//blc
	 }
}
abstract class Product{
private String name;
private double price;
private String category;

public  Product(String name,double price,String category) {
	this.name=name;
	this.price=price;
	this.category=category;
}
public abstract void applyDiscount(double percentage);
public abstract double calculateTax();
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price=price;
		}
		public String toString() {
			return "Name : "+name+"\nPrice :" +price+"\nCategory : "+category;
		}
	}
 class DigitalProduct extends Product
 {
	 private String LicenseKey;
	 public DigitalProduct(String name,double price,String category,String LicenseKey) {
		 super(name,price,category);
		 this.LicenseKey=LicenseKey;
	 }
		public void applyDiscount(double percentage) {
			double Discount = getPrice()*0.1;
			 setPrice(getPrice()-Discount);
			System.out.println("Discount of price : "+Discount);
			System.out.println("price after discount : "+getPrice());
		}
		public double calculateTax(){
			return getPrice()*0.05;
	 }
		@Override
		public String toString() {
			return super.toString()+"\nLicenseKey: " + LicenseKey ;
		}	
}
 
 class PhysicalProduct extends Product{
	 private double shippingWeight;
		 public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
		public void applyDiscount(double percentage) {
			 double Discount = getPrice()*0.15;
			 setPrice(getPrice()-Discount);
				System.out.println("Discount appiled: "+Discount);
				System.out.println("Price After Discount : "+getPrice()); 
		 }
		 public double calculateTax() {
			 return getPrice()*0.08;
		 }
		 public double calculateShippingCost(){
			 return shippingWeight*5;
		 }
		 //}
		 public String toString() {
			 return "Shipping Weight: "+shippingWeight;
		 }
 }
