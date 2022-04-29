package com.example.arrays;

public class PalindromeExample {

	public static void main(String[] args) {

		String name = "MADAM"; // SCP
		String reverse = "";
		char[] words = name.toCharArray();
		/*
		 * for(int i=0;i<words.length;i++) { System.out.println(words[i]); }
		 */

		System.out.println("====================");

		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i];
		}

		System.out.println("reverse of the string is " + reverse);

		if (name.equals(reverse)) {
			System.out.println(" String is a palindrome");
		} else {
			System.out.println(" String is not a palindrome");
		}

	}

}
