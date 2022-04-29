package com.example.statickeyword;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("main");
		Employee e= new Employee(); // Employee.class
		//e.setEmpid(100);
		//e.setName("suresh");
		//e.setCompany("Infosys");
		e.printEmployee(); //instance method
		//Employee.printEmployeeDetails();
		
		// order of execution
		// 1. static block
		// 2. instance block
		// 3. constructor
		
		// to call instance method, we have to create object
		// to call a static method, we can use class name or object.
		
		// from static method or static block we can access only static varaibles.
		
		// ctrl+o ---> see the components of the class
		
	}

}
