package com.example.arrays;

public class SumofFirst10Numbers {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		
		System.out.println("sum of the numbers in array are :"+sum);
	}

}
