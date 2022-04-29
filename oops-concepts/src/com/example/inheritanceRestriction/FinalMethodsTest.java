package com.example.inheritanceRestriction;

class P {

	public final void print() {
		System.out.println("print in parent method");
	}

}

class C extends P {
	
	public void print() {
		System.out.println("print in child method");
	}
}

public class FinalMethodsTest {

	public static void main(String[] args) {

		P p = new C();
		
		p.print();

	}

}
