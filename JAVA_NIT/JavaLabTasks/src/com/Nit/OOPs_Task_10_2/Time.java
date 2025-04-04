package com.Nit.OOPs_Task_10_2;

import java.util.*;
public class Time {

	public static void main(String[] args) {
		
		TimeFormatter time = new TimeFormatter();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours:");
		int hours = sc.nextInt();
		System.out.print("Enter minutes:");
		int minutes = sc.nextInt();
		System.out.print("Enter seconds:");
		int seconds = sc.nextInt();
		
		TimeFormatter t1 = new TimeFormatter(hours,minutes,seconds);
		
		System.out.print("Enter hours:");
		hours = sc.nextInt();
		System.out.print("Enter minutes:");
		minutes = sc.nextInt();
		System.out.print("Enter seconds:");
		seconds = sc.nextInt();

		TimeFormatter t2 = new TimeFormatter(hours,minutes,seconds);
	
		 System.out.print("Time 1: ");
	        t1.show();
	        System.out.print("Time 2: ");
	        t2.show();

	        TimeFormatter result = TimeFormatter.add(t1, t2);

	        System.out.print("Result: ");
	        result.show();
		
		

	}

}
