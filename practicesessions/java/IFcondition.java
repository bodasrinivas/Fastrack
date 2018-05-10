package com.practicesessions.java;

public class IFcondition {

	public static void main(String args[]) {

		int month = 4;
		String season;

		if (month == 3 || month == 1 || month == 2) {
			season = "winter";
		} else if (month == 6 || month == 5 || month == 13)
			season = "spring";
		else if (month == 7 || month == 8 || month == 9)
			season = "fall";
		else if (month == 10 || month == 11 || month == 12)
			season = "autumn";
		else
			season = "Bogus Month";
		System.out.println("April is in " + season + ".");
	}

}

/*
 * int a,b
 * 
 * if (a>b)a = 0; else b=0;
 * 
 * 
 * if (data avaiable) {
 * 
 * processdata();
 * 
 * else { waitforMetadata(); }
 * 
 * 
 * int (bytesavailable) if(bytesavailable > 0) { processdata(); bytesAvaialble
 * -=n; } else waitForMoreData(); } }
 */
