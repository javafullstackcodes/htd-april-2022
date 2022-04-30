package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		//Collection c;
		//List list;
		
		// interfaceName ref= new ImplementationClass();
		
		List list= new ArrayList();
		
		List list1= new ArrayList();
		list1.add("hello");
		list1.add(true);
		list1.add(new Byte((byte) 112));
		
		//System.out.println(list.isEmpty());
		
		list.add(1);// int-> Integer()
		list.add(123);
		list.add("hello");
		list.add("hello");
		list.add(1);
		list.add(123.456);
		
		list.addAll(list1);
		
		System.out.println(list);
		
		System.out.println(list.remove(new Integer(123)));
		
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		
		System.out.println(list);
		
		System.out.println(" list stroed "+list.size()+" elements");
		
		System.out.println("second element is "+list.get(2));
		
		System.out.println(list.remove("hello"));
		
		System.out.println(list.size());
		
		System.out.println(list.contains(123.456)); // true if founds else return false
		
		System.out.println(list.remove(0));
		
		System.out.println(list);
		
		
		
		
		
	}

}
