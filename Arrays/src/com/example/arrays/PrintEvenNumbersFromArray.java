package com.example.arrays;

public class PrintEvenNumbersFromArray {

	public static void main(String[] args) {
		
		int[] data = { 10, 14, 3, 9, 7, 52, 16, 91 };
		
		System.out.println(data.length);
		
		//data[0], data[1]

		for (int i = 0; i < data.length; i++) {
			
			if (data[i] % 2 == 0) {
				System.out.println("even number--> " + data[i]);
			} else {
				System.out.println("odd number--> " + data[i]);
			}
		}
	}

}
