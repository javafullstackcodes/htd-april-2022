package com.example.oops.polymorphism;

import java.util.Objects;

class Student extends Object{
	
	private int id;
	private String name;
	private String course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course, id, name);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setId(123);
		s1.setName("suresh");
		s1.setCourse("java");
		
		Student s2= new Student();
		s2.setId(123);
		s2.setName("suresh");
		s2.setCourse("java");
		
		//System.out.println(s1==s2); //false reference comparison
		//System.out.println(s1.equals(s2)); // equals method is for content comparsion
		
		// == vs equals
		// 1. == we use to compare primitives
		// 1. equals() method we use to compare objects
		// 2. we can also use == operator to compare references
		// 2. By default equals () method uses == operator to compare objects so we need to override it in our class
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		/*
		String p1= "hello";
		String p2= "hello";
		
		int a=10;
		int b=10;
		
		a==b :// true 
		
		if(p1.equals(p2)) {
			System.out.println("both p1 and p2 are same");
		}else {
			System.out.println("both p1 and p2 are not same");
		}
		*/
		
		
		
		if(s1.equals(s2)) { // default implementation in object class uses == operator which is nothing but reference comparison
			System.out.println("both s1 and s2 are same");
		}else {
			System.out.println("both s1 and s2 are not same");
		}
		
		
		

	}

}
