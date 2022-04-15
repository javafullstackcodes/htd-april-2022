package com.example.operators;

public class ForLoopExample {

	public static void main(String[] args) {
		
		//print java for 100 times
		
		for(int i=1;i<=100;++i) {                    //  i=1, 1<=100 --> true   java 1  i=i+1=1+1=2
			System.out.println("java "+i);			//   i=2,  2<=100 --> true  java 2  i=i+1=2+1=3
													//   i=3, 3<=100----> true java 3  i=4
		}
													//	--------               java 100  i=101
													// i=101 101<=100 --> false
	}

}
