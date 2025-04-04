package com.Nit.OOPs_Task_12_3;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String ename = sc.nextLine();
		Employee e1 = new Employee(eid,ename);
		Manager m1 = new Manager(e1);
		System.out.println(m1.toString());
		sc.close();
	}

}
