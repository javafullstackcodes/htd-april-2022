package com.example.practice.ifexample;

public class IfElseExample {

	public static void main(String[] args) {
		
		int subject1=35;
		int subject2=45;
		int subject3=65;
		
		String name="Mr. Bean";
		
		int total=subject1+subject2+subject3;
		
		System.out.println("=================================");
		System.out.println("          Student result         ");
		System.out.println("==================================");
		
		System.out.println(" Name of the student is: "+name);
		
		System.out.println(" Total marks of the student is: "+total);
		
		float avg=total/3;
		
		System.out.println(" Average of the student is: "+avg);
		
		if(avg>=80) { //false
			System.out.println("distinction");
		}else if(avg>=60 && avg<80) { //false && true= false
			System.out.println("first class");
		}else if(avg>=50 && avg<60) { //false && true=false
			System.out.println("second class");
		}else if(avg>=35 && avg<50) { // true && true= true
			System.out.println("third class");
		}else {
			System.out.println("failed");
		}
		
	}

}
