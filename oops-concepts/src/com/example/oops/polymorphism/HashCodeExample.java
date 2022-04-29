package com.example.oops.polymorphism;

import java.util.Objects;

class Employee {
	
	private int id;
	private String company;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String company, double salary) {
		this.id = id;
		this.company = company;
		this.salary = salary;
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(company, id, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && id == other.id
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	// contract between equals() and hashCode
	
	// If two objects are equal by equals() method then they must return same hashcode
	
	
}

public class HashCodeExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1111,"infosys",250000.00);
		Employee e2 = new Employee(1111,"infosys",250000.00);
		
		System.out.println(e1.hashCode()); //517938326
		System.out.println(e2.hashCode()); //1100439041
	
		System.out.println(e1==e2); //false
		
		System.out.println(e1.equals(e2)); // true
		
		//if we want to compare any two objects in java we use equals() method
		
		
		

	}

}
