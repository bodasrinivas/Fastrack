package com.practicesessions.java;

public class MissingBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<15;i++) {
			switch (i) {
			case 0:
			case 1 :
			case 2:
			case 3:
			case 4:
			case 5:
				 	System.out.println("i is less than 6");
				 	break;
			case 6:
			case 7:
			case 8:
			case 9:
	                System.out.println("i is less than 10");
	                break;
	                default:
	                System.out.println("i is 10 or more");
			
		}
	}
}
}
