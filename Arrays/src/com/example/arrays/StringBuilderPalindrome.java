package com.example.arrays;

public class StringBuilderPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb= new StringBuilder("MADAM");
		
		//StringBuilder query= new StringBuilder("select * from ");
		//query.append("emplyoee");
		
		String reverse=sb.reverse().toString();
		String original=sb.toString();
		
		if(original.equals(reverse)) {
			System.out.println("String is palindorome");
		}
		
		
		
		
		

	}

}
