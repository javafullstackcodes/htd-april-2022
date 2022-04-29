package com.example.oops.inheritance;

class Base {
	int a=10;
	public void M1() {
		System.out.println(" Base Class Method ");
	}
}

class Derived extends Base {
	int b=20;
	public void M2() {
		System.out.println("Derived Class Methods ");
	}
	
	// now Derived class contains a, b m1(), m2()
}

class Test {
	public static void main(String[] args) {
		
		Derived d = new Derived(); // creating object
		d.M1(); // print Base Class Method
		d.M2(); // print Derived Class Method
		System.out.println("a="+d.a);
		System.out.println("b="+d.b);
		
	}
}
