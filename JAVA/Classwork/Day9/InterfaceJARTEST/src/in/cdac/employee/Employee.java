package in.cdac.employee;

import in.cdac.person.Person;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee(String s,int d,int a,int b) {
		super(s,d);
		this.empid=a;
		this.salary=b;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Empid :" +this.empid);
		System.out.println("Salry : "+this.salary);
	}
		
}
