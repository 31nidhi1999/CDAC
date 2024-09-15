package employee;

public class Employee implements Comparable<Employee> {
	private String name;
	private int empid;
	private double salary;
	
	public Employee(String name, int id,double sal) {
		this.name=name;
		this.empid=id;
		this.salary=sal;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-5d%-5.2f",this.name,this.empid,this.salary);
	}
	
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	};
	
	
}
