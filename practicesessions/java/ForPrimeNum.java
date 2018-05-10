package com.practicesessions.java;

public class ForPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Boolean isPrime = true;

		num = 14;
		for (int i = 2; i <= num / i; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;

			}
		}
		if (isPrime)
			System.out.println("prime");
		else
			System.out.println("Not prime");
	}

}
