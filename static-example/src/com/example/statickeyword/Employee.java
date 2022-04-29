package com.example.statickeyword;

public class Employee {

	private String name;
	private int empid;
	
	private static String company;
	
	{
		System.out.println("instance block");
		name="suresh";
		empid=145;
	}
	
	static {
		System.out.println("static block");
		company="infosys";
	}
	
	public Employee() {
		System.out.println("constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public static void printEmployeeDetails() {
		System.out.println("Employee company is :" + company);
		// you can access only static varaibles but not instance varaibles

	}

	public void printEmployee() {
		System.out.println("Employee company is :" + company);
		System.out.println("Employee name is :" + name);
		System.out.println("Employee id is :" + empid);
		// access instance +static varaiables
	}

}
