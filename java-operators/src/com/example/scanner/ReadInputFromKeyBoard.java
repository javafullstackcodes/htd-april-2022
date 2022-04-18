package com.example.scanner;

import java.util.Scanner;

public class ReadInputFromKeyBoard {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("please enter your name");
		
		String name=scan.nextLine();
		
		System.out.println("please enter your emp id ");
		int empid= scan.nextInt();
		
		System.out.println("please enter your salary");
		float sal=scan.nextFloat();
		
		
		System.out.println("Name: "+name);
		System.out.println("Employee id "+empid);
		System.out.println("Employee salary "+sal);

	}

}
