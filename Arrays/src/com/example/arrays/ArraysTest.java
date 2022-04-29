package com.example.arrays;

import java.util.Iterator;

public class ArraysTest {
	
	//int a,b,c,d,e,f,g,h,i,j;

	public static void main(String[] args) {
		ArraysTest at= new ArraysTest();
		//System.out.println(at.a);
		
		int[] a= new int[10];
		
		//a[0]=10;
		//a[1]=20;
		//a[2]=30
		//a[9]=90;
		
		//a[i]
		System.out.println(a.length); //size of the array
		
		for(int i=0;i<a.length;i++) {                       // i=0  ; i<10 --> 0<10   a[0]=0;  i++ --->1
															
			a[i]=i; // a[0]=0, a[1]=1,a[2]=3---a[9]=9      // i=1;  		   1<10   a[1]=1;  i++----->2
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println((a[i])); //a[0],a[1],a[2]
		}
		
		
		
		
	}

}
