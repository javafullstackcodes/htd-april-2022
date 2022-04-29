package com.example.arrays;

public class FindMinFromArray {

	public static void main(String[] args) {

		int[] numbers = { 12, 4, 21, 78, 35, 48, 6, 108 ,-21};

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}

		}

		System.out.println("max value in array is " + min);

	}

}
