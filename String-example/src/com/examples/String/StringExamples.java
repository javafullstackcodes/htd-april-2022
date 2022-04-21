package com.examples.String;

public class StringExamples {

	public static void main(String[] args) {
		
		String s1="abc"; // SCP
		
		String s2= new String("abc"); // heap
		
		int a=10;
		int b=10;
		
		if(a==b) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		if(s1==s2) {  // compare references  
			System.out.println("both String objects are same");
		}else {
			System.out.println("both String objects are not same");
		}
		
		// if we want to compare two string contents are equal or not we use equals() method
		
		if(s1.equals(s2)) {  //comparing content
			System.out.println("s1 and s2 are same");
		}else {
			System.out.println("s1 and s2 are same");
		}
		
		// String is immutable= once we create any object then 
		//if we try to modify that object  instead of modification ,
		//it will create a new object
		
		String x="abc";  //  scp   -----> "abc"  --> garbage collected
		x=x+"def";      //        x ------> "abcdef"
		
		System.out.println(x);
		
		
	}

}
