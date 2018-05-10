package com.practicesessions.collections.java;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> In = new ArrayList<Integer>();
		
		System.out.println("Size of an array " + In.size());
		
		In.add(1);
		In.add(2);
		In.add(3);
		In.add(4);
		
		System.out.println("Size of an array " + In.size());
		System.out.println(In);
		
		Integer ia[]  = new Integer[In.size()];
		ia = In.toArray(ia);
		
		int sum =0;
		//sum of an array
		for ( int i :ia)
			sum += i;
		
		System.out.println("sum of an array" + sum);
		
			
		
		
	}

}
