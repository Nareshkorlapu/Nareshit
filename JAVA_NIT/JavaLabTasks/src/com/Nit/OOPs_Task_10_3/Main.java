package com.Nit.OOPs_Task_10_3;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Id:");
		int studentId = sc.nextInt();
		sc.nextLine();
		if (studentId < 0) {
            System.out.println("Error: Student ID cannot be negative.");
            return;
        }
		System.out.print("Enter Student Name:");
		String studentName = sc.nextLine();
		
		if (studentName.isBlank() || studentName.isEmpty()) {
            System.out.println("Error: Student name cannot be empty.");
            return;
        }
		System.out.print("Enter student Age:");
		int studentAge = sc.nextInt();
		Student s1 = new Student(studentId,studentName,studentAge);
		
		System.out.println("Student Details:");
		s1.showDetails();
		
		
		Player player = new Player(s1);
		
		System.out.println("Player Details:");
		player.showDetails();
		
		player.updateName();
		while (player.getPlayerName().isEmpty() || player.getPlayerName().isBlank()) {
            player.updateName();
		}
		System.out.println("updated record:");
		player.showDetails();
		System.out.println("Is Player Eligible?"+player.isEligible());
		sc.close();
	}

}
