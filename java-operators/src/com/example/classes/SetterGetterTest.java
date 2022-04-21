package com.example.classes;

class Employee{
	
	private int empId;
	private String name;
	private String dept;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}
	
}


public class SetterGetterTest {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		  
		//int i=10;
		
		//System.out.println(i); //10
		
		// to access the varaibles of the class we use objectName.vraibleName (dot) operator
		// to access the methods of the class we use   objectName.methodName() (dot) operator
		
		emp.setEmpId(100);
		emp.setDept("Finance");
		emp.setName("sudheer");
		
		System.out.println(emp); //com.example.classes.Employee@7fbe847
		
		System.out.println("employee name is "+emp.getName());
		System.out.println("employee id is "+emp.getEmpId());
		System.out.println("employee department is "+emp.getDept());

		
	}

}
