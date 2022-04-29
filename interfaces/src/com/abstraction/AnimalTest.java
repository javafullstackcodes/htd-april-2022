package com.abstraction;

  abstract class Animal {
	
	int a , b;

	public abstract void run(); // method decleartion
	
	public void eat() {
		System.out.println(" animal eating");
	}
	
	public Animal(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println(" default constructor"+a+" "+b);
	}

}

/*
class Dog extends Animal {

	@Override
	public void run() {
		System.out.println(" Dog is running");

	}

}*/

class Tiger extends Animal {
	
	int c;
	public Tiger() {
		this(3);
		System.out.println("tiger class constructor");
	}
	
	public Tiger(int c) {
		super(1,2);
		this.c=c;
		System.out.println("tiger class constructor c= "+c);
	}


	@Override
	public void run() {
		System.out.println(" Tiger is running");

	}

}

public class AnimalTest {

	public static void main(String[] args) {
		// Animal a= new Animal();
		
		// Child c= new Child();
		
		//Tiger d = new Tiger();
		//d.run();
		
		
	  // Parent p= new Child();
		
		Animal a = new Tiger(); // runtime polymorphism
		a.eat();

	}

}
