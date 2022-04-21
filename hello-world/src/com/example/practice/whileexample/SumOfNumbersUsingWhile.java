package com.example.practice.whileexample;

public class SumOfNumbersUsingWhile {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("sum of numbers from 1-10 is : "+sum);
		
		
		/*
		for(int i=1;i<=10;i++) {    // i=1,  1<=10   sum=0+1=1, i=2
			sum=sum+i;				// i=2   2<=10   sum=1+2=3  i=3
									// i=3   3<=10;  sum=3+3=6  i=4
									//-----------------------------
		}
		*/
	}

}
