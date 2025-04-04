package com.Nit.OOPs_Task_10_3;

import java.util.Scanner;

public class Player {
	private int playerId;
	private String playerName;
	private int playerAge;
	
	public Player(Student student)
	{
	
		this.playerId=student.getStudentId();
		this.playerName=student.getStudentName();
		this.playerAge=student.getStudentAge();
	}
	


	public void showDetails()
	{
		System.out.println("Player Details: Player ID:"+playerId+", Name:"+playerName+", Age:"+playerAge);
		
	}
	
	public void updateName()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter  new Student Name:");
		String studentName = sc.nextLine();
		
		if (studentName.isBlank() || studentName.isEmpty()) {
            System.out.println("Error: Student name cannot be empty.");
            this.playerName=studentName;
            return;
        }
		this.playerName=studentName;
	}
	
	public String getPlayerName() {
		return playerName;
	}



	public boolean isEligible()
	{
		return playerAge>=18;
	}
}
