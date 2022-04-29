package com.example.oops.polymorphism;

class Parent{
	
	public void m1() {
		System.out.println(" parent class method");
	}
	
	public void m2() {
		System.out.println(" parent class m2() method");
	}
	
}

class Child extends Parent{
	
	public void m1() {
		System.out.println(" child class method");
	}
	
	public void m3() {
		System.out.println(" child class method m3()");
	}
		
}


public class PolyMorphismTest {

	public static void main(String[] args) {
		
		//Child c= new Child(); // using this child class reference i can call both parent+child class methods
		//c.m1(); //child class method
		//c.m2();
		
		//Parent p= new Parent(); // using this we can only call parent class methods
		//p.m1(); //parent class method
		//p.m2();
		//p.m3(); compile time error it cant access child class methods
		
		// ParentClassName reference= new ChildClass()
		
		Parent p1 = new Child(); // runtime polymorphism  p1-------> child object
		p1.m1();
		p1.m2();
		//p1.m3();
		
		
		
		
		
		
	}

}
