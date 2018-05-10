package com.practicesessions.collections.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		ArrayList<String>  lm = new ArrayList<String>();
		
		System.out.println("size of array " + lm.size());
		
		lm.add("neel");
		lm.add("bruno");
		lm.add("keith");
		lm.add("5");
		lm.add("medlin");
		
		
		System.out.println("size of array " + lm.size());
		System.out.println("show the content in array " + lm);
		
		lm.remove("5");
		lm.remove("neel");
		
		System.out.println("size of an array " + lm.size());
		System.out.println("show the content in array " + lm);
		
	}

}
