package com.practicesessions.java;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int news[][] = new int[3][5];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)

				news[i][j] = (i + 5) * (j + 5);

		// For each (to dispaly and sum values)

		for (int x[] : news)
			for (int y : x) {
				System.out.println("value of " + y);
				sum = sum + y;

			}

		System.out.println("summation of " + sum);

	}
}
