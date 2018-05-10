package com.argumentpassing.java;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test ob = new Test();
			int a = 15, b = 20;
			System.out.println("a and b before call: " +
			a + " " + b);
			ob.meth(a, b);
			System.out.println("a and b after call: " +
			a + " " + b);
			}
			}
	

