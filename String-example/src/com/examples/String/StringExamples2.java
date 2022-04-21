package com.examples.String;

public class StringExamples2 {

	public static void main(String[] args) {

		String name = "helloworld";
		System.out.println(name.toUpperCase());

		String name2 = "HELLOWORLD";
		System.out.println(name2.toLowerCase());

		System.out.println(name2.charAt(2));// to get character from a string

		System.out.println(name2.indexOf("e")); // to search a string or char and get index

		if (name.equals(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both not are same");
		}

		if (name.equalsIgnoreCase(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both not are same");
		}

	}

}
