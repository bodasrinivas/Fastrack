package com.methodsandclasses.java;

public class OverloadExt extends Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			OverloadExt ob = new OverloadExt();
			
			double result;
			
			ob.test();
			
			ob.test(10);
			ob.test(10, 20);
			result = ob.test(123.25);
			System.out.println("Result of ob.test(123.25): " + result);
			}
			
	}

