package com.example.oops.inheritance;

//import java.lang.String;
public class ObjectClassExample extends Object {

	@Override
	public String toString() {
		return "this is my own implementation";
	}

	/// String name="";
	// Properties, fields, variables, state

	public static void main(String[] args) {

		ObjectClassExample obj = new ObjectClassExample();

		int i = 10;
		System.out.println(i);// i=10

		System.out.println(obj);// pacakgename.className @some-hexadecimal code
		// com.example.oops.inheritance.ObjectClassExample@1963006a

	}

}
