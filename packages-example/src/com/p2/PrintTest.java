package com.p2;

import com.p1.Print;

public class PrintTest extends Print{

	public static void main(String[] args) {
		PrintTest p= new PrintTest();
		p.print();
		System.out.println(p.e);
		// objectName.varaibleName
		// System.out.println(p.a); default scope
		// protected=default+child class of other package
	}

}
