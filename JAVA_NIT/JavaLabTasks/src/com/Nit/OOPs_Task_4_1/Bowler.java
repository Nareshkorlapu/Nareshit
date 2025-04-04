//BLC

package com.Nit.OOPs_Task_4_1;

public class Bowler {
	String cricketerName;
	int noOfWickets;
	int noOfMatches;
	int noOfBalls_bowled;
	int noOfRuns_conceded;
	double strikeRate;
	double bowlingAvg;

	public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
		cricketerName = name;
		noOfWickets = wickets;
		noOfMatches = matches;
		noOfBalls_bowled = balls_bowled;
		noOfRuns_conceded = runs_conceded;
	}

	public void computeBowlingAvereage() {
		if (noOfWickets > 0 && noOfMatches > 0 && noOfBalls_bowled > 0 && noOfRuns_conceded > 0) {
			bowlingAvg =  ((double)noOfRuns_conceded / (double)noOfWickets);
			System.out.println("Name:" + cricketerName);
			System.out.println("Bowling Average is:" + bowlingAvg);
		} else {
			System.out.println("Error! Enter positive number");
		}

	}

	public void computeStrikeRate() {
		if (noOfWickets > 0 && noOfMatches > 0 && noOfBalls_bowled > 0 && noOfRuns_conceded > 0) {
			strikeRate = ((double)noOfRuns_conceded /(double)noOfBalls_bowled);
			System.out.println("Name:" + cricketerName);
			System.out.println("Strike rate is:" + strikeRate);
		} else {
			System.out.println("Error! Enter positive number");
		}
	}

	public void showStatistics() {
		if (noOfWickets > 0 && noOfMatches > 0 && noOfBalls_bowled > 0 && noOfRuns_conceded > 0) {
			System.out.println("Name:" + cricketerName);
			System.out.println("Wickets:" + noOfWickets);
			System.out.println("Matches:" + noOfMatches);
			System.out.println("Balls_bowled:" + noOfBalls_bowled);
			System.out.println("Runs Conceded:" + noOfRuns_conceded);
		} else {
			System.out.println("Error! Enter positive number");
		}
	}
}
