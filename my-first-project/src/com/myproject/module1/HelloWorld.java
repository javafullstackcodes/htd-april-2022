package com.myproject.module1;

import java.util.Date;
import java.lang.Object;
public class HelloWorld {
 
	public static void main(String[] args) {
		
		// int + int =int
		// int+ float=float
		// char+char=char
		//int+char=int
		System.out.println(123+124);
		System.out.println(122+13.4f);
		System.out.println('A'+'B');
		System.out.println(10==10);
		String s1="hello";//literal create SCP
		String s2="hello"; 
		
		System.out.println(s1==s2);
		
		String s3= new String("hello"); //heap memory
		String s4=new String("hello");
		System.out.println(s3==s4);//
		
		System.out.println(s3.equals(s4));
		
	}
	
	
}
