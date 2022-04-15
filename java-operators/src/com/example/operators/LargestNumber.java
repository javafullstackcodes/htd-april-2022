package com.example.operators;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 10, b = 27, c = 6;

		if (a >= b && a >= c) { // false && true +> false
			System.out.println("a is largest " + a);
		}

		if (b >= a && b >= c) { // true && true  => true
			System.out.println("b is largest " + b);
		}

		if (c >= a && c >= b) { //false && false  => false
			System.out.println("c is largest " + c);
		}
	}

}
