package com.example.operators;

public class ProductOfFirst10Numbers {

	public static void main(String[] args) {
	
		long product=1;
		
		for(int i=1;i<=5;i++) {
			product=product*i;
		}
		
		System.out.println("product of numbers is "+product);
	
	}

}
