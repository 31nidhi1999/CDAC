package demo;

public class Employee implements Cloneable {
	private String name;
	private int id;
	private double salary;
	Date dateOfJoinning= new Date();
	
	public Employee(String name, int id,double salary,int date,int mount, int year) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.dateOfJoinning.setDay(date);
		this.dateOfJoinning.setMonth(mount);
		this.dateOfJoinning.setYear(year);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateOfJoinning() {
		return dateOfJoinning;
	}
	
	
	/*
	 * @Override public Employee clone() throws CloneNotSupportedException { Object
	 * obj = super.clone(); return (Employee)obj; }
	 */
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee emp=(Employee) super.clone();
		emp.dateOfJoinning=this.dateOfJoinning.clone();
		
		return emp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.id+" "+this.salary+" "+this.dateOfJoinning.toString();
	}
}
