package com.example.collection;

import java.util.ArrayList;
import java.util.List;

class Employee extends Object{
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
	}
	
	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	
}

public class EmpListTest {

	public static void main(String[] args) {
			
		Employee emp1= new Employee(123,"x",25000);
		Employee emp2= new Employee(321,"y",75000);

		Employee emp3= new Employee(456,"z",55000);
		Employee emp4= new Employee(789,"a",25000);
		Employee emp5= new Employee(234,"b",45000);
		Employee emp6= new Employee(555,"d",35000);

		//com.example.collection.Employee@368102c8
		
		List<Employee> list = new ArrayList<Employee>();
		
		 list.add(emp5);
		 list.add(emp4);
		 list.add(emp3);
		 list.add(emp2);
		 list.add(emp1);
		 list.add(emp5);
		
		//list.add(123);// it does not all other data types except Employee
		// list.add("lisst"); it does not all other data types except Employee
		 
		 // [emp1,emp2,emp3,emp4,emp5]
		 System.out.println(list);
		 
		 System.out.println(list.size());
		 System.out.println("is emp1 is present "+list.contains(emp1));
		 System.out.println("is emp1 is present "+list.contains(emp6));
		 
		 //for(dataType v:collection/arrayName){
		 
	     //}
		 
		for(Employee emp:list) {
			
			System.out.println(emp);
		}
		

		
		
		
		
		

	}

}
