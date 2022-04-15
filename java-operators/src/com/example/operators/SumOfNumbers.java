package com.example.operators;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {    // i=1,  1<=10   sum=0+1=1, i=2
			sum=sum+i;				// i=2   2<=10   sum=1+2=3  i=3
									// i=3   3<=10;  sum=3+3=6  i=4
									//-----------------------------
		}
		System.out.println("sum of first 10 numbers is "+sum);
	}

}
