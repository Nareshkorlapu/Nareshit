package com.Nit.OOPs_Task_10_1;

import java.util.*;
public class SportInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sport Name:");
		String sportName = sc.nextLine();
		System.out.print("Enter the Size of the team: ");
		int teamSize = sc.nextInt();
		
		Sports sport1 = new Sports(sportName,teamSize);
		sport1.displayInfo();
	
		System.out.println(sport1);
		
		
		sc.close();
		
		
		

	}

}
