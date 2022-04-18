package com.example.classes;

class Student{
	
	int sid;
	String sname;
	
	public Student() {
		System.out.println("0-args constructor");
	}
	
	public Student(int id,String name) {
		sid=id;//sid=123;
		sname=name; //sname="sudheer"
	}
	
}

public class ClassesandObjects {

	public static void main(String[] args) {
		
		//className reference= new className();
		Student student=  new Student(10, "surendra");
		
		//objectname.varaibleName
		
		System.out.println("student id is : "+student.sid); //0
		System.out.println("student id is : "+student.sname); //null

	}

}
