package com.examples.String;

public class StringExamplesTest {

	public static void main(String[] args) {
		
		String s1="abc"; //SCP  s1---->"abc"
						 //			 |
		String s2="abc"; // SCP s2---|
		
		System.out.println(s1==s2); // true
		
		String s3= new String("abc"); // heap s3---> "abc"
		String s4= new String("abc"); // heap s4 --> "abc"
		
		//referenc comparison
		System.out.println(s3==s4); // false
		
		System.out.println(s1==s3); // false
		
		//content comparison
		System.out.println(s1.equals(s3));
		
	}

}
