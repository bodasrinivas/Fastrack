package com.practicesessions.java;

public class Switch {

	
	public static void main(String []args) {
		
		int month  = 4;
		String Season;
		
		switch (month) {
		case 12 :
		case 1:
		case 4:
			Season = "winter";
			break;
		case 5:
		case 6:
		case 7:
			Season = "rainy";
			break;
			default:
				Season = "bogus season";
		}
				System.out.println("April month is in " + Season);
	}
				
		}
