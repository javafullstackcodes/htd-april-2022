package com.example.multileIheritance;

import java.io.Serializable;

/*
class A{
	
	public void methodA() {
		System.out.println("A method");
	}
	
}

class B {
	
	public void methodB() {
		System.out.println("B method");
	}
}

class C extends A,B{   // implement inheritance through classes not possible
	public void methodC() {
		System.out.println("C method");
	}
}
*/

interface A{
	 void methodA();
}

interface B{
	 void methodB();
}

interface C extends A,B{
	 void methodC();
}

class MyImpl implements C{

	@Override
	public void methodA() {
		System.out.println(" A method");
		
	}

	@Override
	public void methodB() {
		System.out.println(" B method");
		
	}

	@Override
	public void methodC() {
		System.out.println(" C method");

	}
	
}

interface MyMarkerInterface{
	// marker interface does'not have any methods example : Cloneable,Serializable etc.
}


public class MultipleInheritanceTest implements Serializable{

	public static void main(String[] args) {
		// interfaceName ref= new ImplementatinClass()
		C c= new MyImpl();
		c.methodA();
		c.methodB();
		c.methodC();
	}

}
