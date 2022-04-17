package com.basic.swithexample;

import java.util.Scanner;

class ScannerTest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = s.nextLine();
		System.out.println("Enter age ");
		int age = s.nextInt();
		System.out.println("Enter percentage ");
		float percentage = s.nextFloat();
		System.out.println("Enter result status ");
		boolean result = s.nextBoolean();
		System.out.println("Enter contact number ");
		long contact = s.nextLong();
		char gender;
		System.out.println("Enter Gender ");
		gender = s.next().charAt(0);
		System.out.println("Student Details Entered by you are");
		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Contact : " + contact);
		System.out.println("Score : " + percentage);
		System.out.println("Result: " + result);
	}
}
