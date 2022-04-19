package com.example.classes;

class Student{
	
	int sid; //0 
	String sname; //null
	String course; // null
	
	public Student() {
		this(123,"sudheer","java"); // constructor call
		System.out.println("0-args constructor");
		
	}
	
	public Student(int sid,String name) {
		this.sid=sid;	//sid=123;
		this.sname=name; //sname="sudheer"
	}
	
	public Student(int id,String name,String c) {
		sid=id;//sid=123;
		sname=name; //sname="sudheer"
		course=c;
	}
	
	
	
}

public class ClassesandObjects {

	public static void main(String[] args) {
		
		//className reference= new className();
		Student s=  new Student();
		
		Student student=  new Student(10, "surendra");
		
		Student student1= new Student(11,"sudheer","java");
		
		//objectname.varaibleName
		
		System.out.println("student id is : "+s.sid); //0
		System.out.println("student name is : "+s.sname); //null
		System.out.println("student course is : "+s.course);

	}

}
