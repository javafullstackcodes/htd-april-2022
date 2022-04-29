package com.example.arrays;

class Student{
	int a=10;
	String name="sudheer";
	
	public Student(int a, String name) {
		this.a = a;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", name=" + name + "]";
	}
	
}

public class ArraysErrors {

	public static void main(String[] args) {
		
		int[] nums= new int[3];
		
		//System.out.println(nums[4]);
		
		//int[] nums1= new int[3];
		
		//System.out.println(nums);
		//Student s= new Student();
		//System.out.println(s);
		
		//float[] values= new float[10];
		
		//System.out.println(values);
		
		Student s1= new Student(10, "abc");  // int a=10
		Student s2= new Student(11, "def"); //int b=20
		Student s3= new Student(12, "ghi"); //int c=30

		Student[] students= new Student[3]; // int[] numbers= new int[3];
		students[0]=s1;						// numbers[0]=a;
		students[1]=s2;						// numbers[1]=b;
		students[2]=s3;						// numbers[2]=a;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		
		System.out.println("==============working with object[]===================");
		
		Object[] myobj= new Object[4];
		int a=10;
		float b=20;
		String s="hello";
		Student s4= new Student(121,"kb");
		
		myobj[0]=a;
		myobj[1]=b;
		myobj[2]=s;
		myobj[3]=s4;
		
		System.out.println(myobj[0]);
		System.out.println(myobj[1]);
		System.out.println(myobj[2]);
		System.out.println(myobj[3]);
		
		//foreach java 1.5
		// syntax for(datatype varName : array/collection)
		System.out.println("=================using foreach==================");
		for(Object obj:myobj) {
			System.out.println(obj);
		}
		
		System.out.println("===========using foreach iterate student============");
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println("==========iterate using int[] array===============");
		int[] numbers= {10,20,30,40,50};
		
		for (int i : numbers) {
			System.out.println(" i value is "+i);
		}
		
		
	}

}
