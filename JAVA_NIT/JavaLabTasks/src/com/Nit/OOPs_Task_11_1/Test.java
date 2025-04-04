package com.Nit.OOPs_Task_11_1;

import java.util.*;
class Employee
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	public Employee(int id, String name, double basicSalary,double HRAPer, double DAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
	}

	
	public double calculateGrossSalary()
	{
		return basicSalary+HRAPer+DAPer;
	}
}

class Manager
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manager(int id,String name,double basicSalary,double HRAPer,double DAPer,double projectAllowance)
	{
		super();
		this.id= id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.projectAllowance = projectAllowance;
	}
	public double calculateGrossSalary()
	{
		
		return basicSalary+HRAPer+DAPer+projectAllowance;
	}
}

class Trainer
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount, double perkPerBatch)
	{
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	public double calculateGrossSalary()
	{
		
		return basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch);
	}
}

class Sourcing
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int id, String name, double basicSalary,double HRAPer,double DAPer,int enrollmentTarget,int enrollmentReached,double perkPerEnrollment)
	{
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double calculateGrossSalary()
	{
		return basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
	}
}


class TaxUtil
{
	public double calculateTax(Employee e1) {
		if(e1.calculateGrossSalary()>30000) {
			return e1.calculateGrossSalary()*0.2;
		}
		else {
			return e1.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax(Manager m1) {
		if(m1.calculateGrossSalary()>30000) {
			return m1.calculateGrossSalary()*0.2;
		}
		else {
			return m1.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax(Trainer t1) {
		if(t1.calculateGrossSalary()>30000) {
			return t1.calculateGrossSalary()*0.2;
		}
		else {
			return t1.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax(Sourcing s1) {
		if(s1.calculateGrossSalary()>30000) {
			return s1.calculateGrossSalary()*0.2;
		}
		else {
			return s1.calculateGrossSalary()*0.05;
		}
	}	

}
public class Test {

	public static void main(String[] args) {
		double tax;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id:");
		int id = sc.nextInt();
		System.out.print("Enter name:");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Basic Salary:");
		double basicSalary = sc.nextDouble();
		System.out.print("Enter HRA:");
		double HRAPer = sc.nextDouble();
		System.out.print("Enter DA:");
		double DAPer = sc.nextDouble();
		TaxUtil tu=new TaxUtil();
		Employee e1=new Employee(id,name,basicSalary,HRAPer,DAPer);
		tax=tu.calculateTax(e1);
		System.out.println(e1.id+" "+e1.name+ " Gross salary:"+e1.calculateGrossSalary()+" Employee tax:"+ tax );
		System.out.print("Enter Project Allowance");
		double projectAllowance = sc.nextDouble();
		Manager m1=new Manager(id, name,basicSalary, HRAPer, DAPer, projectAllowance);
		tax=tu.calculateTax(m1);
		System.out.println(m1.id+" "+m1.name+ " Gross salary:"+m1.calculateGrossSalary()+" Manager tax:"+ tax );
		System.out.print("Enter Batch Count:");
		int batchCount = sc.nextInt();
		System.out.print("Enter Batch Perk:");
		int perkPerBatch = sc.nextInt();
		Trainer t1=new Trainer(id,name, basicSalary, HRAPer, DAPer, batchCount, perkPerBatch);
		tax=tu.calculateTax(t1);
		System.out.println(t1.id+" "+t1.name+ " Gross salary:"+t1.calculateGrossSalary()+" Trainer tax:"+ tax );
		System.out.print("Enter Enrolled Target:");
		int enrollmentTarget = sc.nextInt();
		System.out.print("Enter Enrolled Reached:");
		int enrollmentReached = sc.nextInt();
		System.out.print("Enter Perk Enrollment:");
		double perkPerEnrollment = sc.nextDouble();
		Sourcing s1=new Sourcing(id, name, basicSalary, HRAPer, DAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);
		tax=tu.calculateTax(s1);
		System.out.println(s1.id+" "+s1.name+ " Gross salary:"+s1.calculateGrossSalary()+" Sourcing tax:"+ tax ); 

	}

}
