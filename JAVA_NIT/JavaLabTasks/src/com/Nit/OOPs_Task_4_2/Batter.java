//BLC

package com.Nit.OOPs_Task_4_2;

public class Batter {
	String cricketerName;
	int noOfRuns;
	int noOfMatches;
	float batting_avg;
	
	public void batterDetails(String name,int runs,int matches)
	{
		cricketerName=name;
		noOfRuns=runs;
		noOfMatches=matches;
	}
	
	public void computeBattingAverage()
	{
		if(noOfRuns>0 && noOfMatches>0)
		{
		batting_avg=((float)noOfRuns/(float)noOfMatches);
		System.out.println("Name:"+cricketerName);
		System.out.println("Batting_Avg:"+batting_avg);
		}
		else if(noOfRuns>0 && noOfMatches==0)
		{
			System.out.println("Error! Please enter positive number");
		}
	}
	
	public void getStatistics()
	{
		if(noOfRuns>0 && noOfMatches>0)
		{
//		System.out.println("Name:"+cricketerName);
		System.out.println("Runs:"+noOfRuns);
		System.out.println("Matches:"+noOfMatches);
		}
		else if(noOfRuns>0 && noOfMatches==0)
		{
			System.out.println("Error! Please enter positive number");
		}
		
	}
}

