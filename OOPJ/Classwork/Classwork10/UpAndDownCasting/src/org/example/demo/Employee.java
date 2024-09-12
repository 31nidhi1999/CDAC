package org.example.demo;

public class Employee extends Person {
	int empId;
	double salary;
	
	public Employee() {
		this(null,0,0,0);
	}
	
	public Employee(String s, int age, int id,double salary) {
		super(s,age);
		this.empId=id;
		this.salary=salary;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.age+" "+this.empId+" "+this.salary;
	}
	
}
