package com.basic.swithexample;

public class SwitchExample {

	public static void main(String[] args) {

		int number = 5;
		
		switch (number) {   // "int" selector byte,short, int, long, char, double, float, Integer,Float,Character, Double etc.
		case 1: // "int" value
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.err.println("OTHER");
		}

		System.out.println("exit from switch case");

	}

}
