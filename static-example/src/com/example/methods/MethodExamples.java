package com.example.methods;

public class MethodExamples {
	
	// method definition or declaration
	
	public void printData() {
		System.out.println(" this printData() method is called");
	}

	public static void main(String[] args) {
		
		MethodExamples m= new MethodExamples();
		// objectName.methodName()
		
		m.printData();// calling a method
		
	}

}
