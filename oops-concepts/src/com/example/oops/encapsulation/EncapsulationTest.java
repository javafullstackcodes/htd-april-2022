package com.example.oops.encapsulation;

class Student{
	
	private String name;
	private String course;
	private int id;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", id=" + id + "]";
	}
	
}
public class EncapsulationTest {

	public static void main(String[] args) {
		Student s= new Student();
		s.setCourse("java");
		s.setId(123);
		s.setName("Rahul");
		
		System.out.println(s);
		
	}

}
