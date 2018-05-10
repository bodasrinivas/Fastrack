package com.argumentpassing.java;

public class Test1 {
	
		int a, b;
		Test1(int i, int j) {
		a = i;
		b = j;
		}
		// pass an object
		void meth(Test1 o) {
		o.a *= 2;
}
}