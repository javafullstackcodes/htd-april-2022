package com.example.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f = 0, f1 = 1, f2 = 1;
		int n = 10;
		int i = 1;
		System.out.println(f);
		System.out.println(f1);
		while (i <= n - 2) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.println(f1);
			i++;

		}

	}

}
