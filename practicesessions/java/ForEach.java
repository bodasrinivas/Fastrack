package com.practicesessions.java;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*int nums []= {1,2,3,4,5,6,7,8,9,};
  int sum =0;
       // for loop 2 types :
	  
	//  for(int i=0; i < 10; i++) 
	 *  sum += nums[i]; or sum = sum+nums[i];
  
  for (int x :nums) {
	  System.out.println("value is " +  x);
	  //sum = sum+x;
	  sum += x;
  }
  System.out.println("summation " +  sum);
	}*/

	
	// for each loop which says read only 
		/*
		int nums[] = {1,2,3,4,5,6,7,8,9};
	
		for (int exp : nums) {
			System.out.println(exp+ "   ");
			//System.out.println();
			//exp =exp * 10;
		}
		
		System.out.println();
		
		for (int exp : nums) {
			System.out.println(exp+ "   ");
			System.out.println();
				
	}
		*/
		
		//Searching a vale in an given array list
		int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		int val = 10;
		   boolean found = false;
		
		for(int x : nums) {
		   if(x == val) {
		 found = true;
		 break;
		}}
		
		if(found)
		 System.out.println("Value found!");
		
	else 
		System.out.println("Value not found!");
}
		}
		
