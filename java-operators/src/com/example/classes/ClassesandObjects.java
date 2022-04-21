package com.example.classes;

class Student{
	
	int sid; //0 
	String sname; //null
	String course; // null
	String college; //4 bytes-->1000*4=4000
	
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
	
	public Student(int id,String name,String c,String collegeName) {
		sid=id;//sid=123;
		sname=name; //sname="sudheer"
		course=c;
		college=collegeName;
	}
	
	
	
}

public class ClassesandObjects {

	public static void main(String[] args) {
		
		//className reference= new className();
		Student s=  new Student();
		
		Student student=  new Student(10, "surendra","C++","Narayana");
		
		Student student1= new Student(11,"sudheer","java","Narayana");
		
		//objectname.varaibleName
		
		System.out.println("student id is : "+student.sid); //0
		System.out.println("student name is : "+student.sname); //null
		System.out.println("student course is : "+student.course);
		System.out.println("student college is : "+student.college);
		System.out.println("=============================");
		System.out.println("student id is : "+student1.sid); //0
		System.out.println("student name is : "+student1.sname); //null
		System.out.println("student course is : "+student1.course);
		System.out.println("student college is : "+student1.college);

	}

}
