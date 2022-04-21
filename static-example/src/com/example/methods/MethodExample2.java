package com.example.methods;

public class MethodExample2 {
	
	private int a; //10 //instance varaibles
	int b; //20 //instance varaibles

	public MethodExample2(int a, int b) {
		this.a = a;// this.a=10;
		this.b = b;//this.b=20;
	}

	public int addNumbers(int a,int b) {
		int c; // local varaible
		c=a+b; //c=10+20;
		return c;
		
	}
	
	public MethodExample2() {
		// TODO Auto-generated constructor stub
	}

	public int addNumbers() {
		int c; // local varaible
		c=a+b; //c=10+20;
		return c;
		
	}
	
	public boolean isValidVoter(int age) {
		if(age>=18) {
			return true; //valid voter 
		}else {
			return false; // invalid voter
		}
		
	}
	
	public static float division(float a, float b) {
		return a/b;
		// System.out.println("not reachable"); not reachable after return statement
	}
	

	public static void main(String[] args) {
		
		MethodExample2 m2= new MethodExample2();
		//MethodExample2 m2= new MethodExample2(10, 20);
		//int result=m2.addNumbers(10, 20);
		//System.out.println("adding of two numbers "+result);
		
		//int result=m2.addNumbers();
		//System.out.println("adding of two numbers "+result);
		
		boolean res=m2.isValidVoter(19);
		System.out.println("is valid voter ? "+res);
		//float result=m2.division(12.56f, 13.56f);
		
		// call static methods using className.methodName()
		float result=MethodExample2.division(12.56f, 13.56f);
		
		System.out.println("division result "+result);
		System.out.println(MethodExample2.division(12.78f, 16.56f));
		System.out.println(MethodExample2.division(12.98f, 19.586f));
		System.out.println(MethodExample2.division(14.56f, 11.56f));
		System.out.println(m2.a);
		
	}

}
