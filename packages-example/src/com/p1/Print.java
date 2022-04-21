package com.p1;

public class Print {

	int a; 				// default scope
	public int b = 20;  // public scope
	private int c = 30; // private scope
	protected int e=50;

	// instance block
	{
		a = 10;
	}

	// default scope
	public void print() {
		System.out.println("print message");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("e= "+ e);
	}

}
