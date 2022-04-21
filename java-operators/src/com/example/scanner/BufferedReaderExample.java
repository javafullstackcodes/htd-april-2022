package com.example.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("please enter emp id "); //"123"--> int
		
		String name=reader.readLine();
		
		//int number=Integer.parseInt(name);
		
		float number= Float.parseFloat(name);
		
		System.out.println("you have entered "+number);
		//"123" --> Integer.parseInt("123")=int
	}

}
