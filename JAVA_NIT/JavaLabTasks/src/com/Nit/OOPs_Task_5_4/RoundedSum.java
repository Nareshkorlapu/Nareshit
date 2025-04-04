package com.Nit.OOPs_Task_5_4;

public class RoundedSum {
		
	    public static int sumOfRoundedValues(int a, int b, int c) {
	        return roundToNearestTen(a) + roundToNearestTen(b) + roundToNearestTen(c);
	    }
	    
	    private static int roundToNearestTen(int num) {
	        return (num + 5) / 10 * 10;  
	    }

}
