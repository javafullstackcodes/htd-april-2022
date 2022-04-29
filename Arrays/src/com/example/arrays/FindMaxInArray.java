package com.example.arrays;

public class FindMaxInArray {

	public static void main(String[] args) {
		
		int[] numbers= {12,4,21,78,35,48,6,108};
		
		int max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
		
		System.out.println("max value in array is "+max);
		
		
		
	}

}
