package in.cdac.domain;

public class Employee {
	private int empId;
	private double salary;
	private Date d = new Date();
	private Address add;
	
	public Employee() {
		this(0,0.0);
	}
	
	public Employee(int id,double sal) {
		this.empId=id;
		this.salary=sal;
	}
	
	
	public Employee(int id,double sal,Address add, Date d) {
		this.empId=id;
		this.salary=sal;
		this.add=add;
		this.d=d;
	}
	
	
	

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId+" "+this.salary+" "+this.add.toString()+" "+this.d.toString();
	}
	

}
