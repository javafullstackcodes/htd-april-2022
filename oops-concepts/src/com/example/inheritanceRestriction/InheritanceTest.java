package com.example.inheritanceRestriction;

 class Abc {
	
	//private methods, private varaibles wont participate in inheritance.
	private void myPrivateMethod() {
		System.out.println("private method");
	}
	
	
}

class B extends Abc{
	
	public void myPublicMethod() {
		System.out.println("public method");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		B b= new B();
		//b.myPrivateMethod() private methods cant access through child class object
		b.myPublicMethod();
		
		Abc a= new Abc();
		//a.
		
	}

}
