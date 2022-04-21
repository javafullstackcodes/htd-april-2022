package com.p1;


public class PrintTest2 {
	
	private int d=40;

	public static void main(String[] args) {
		PrintTest2 obj= new PrintTest2();
		Print p= new Print();
		p.print(); // calling print method
		System.out.println(p.a); // accessing instance varaible
		System.out.println(p.b); 
		//System.out.println(p.c); // private we can't access outside of any class
		System.out.println(obj.d);
		System.out.println(p.e); // protected= default+ child class in other package
	}

}
