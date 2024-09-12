import java.util.Scanner;

public class Employee {
	
	private static int empCount;
	private static double totalSalary;
	
	private int empId;
	private String empName;
	private double salary;
	private double salaryRaised;
	
	public Employee() {
		empCount++;
	}
	
	
	public double getSalaryRaised() {
		return salaryRaised;
	}

	public void applyRaise(double percentage) {
		this.salaryRaised =  this.salary*percentage/100;
	}
	
	public void calculateTotalSalaryExpense() {
		 totalSalary = this.salary + this.salaryRaised + totalSalary;
	}

	public  void updateSalary(double newSalary) {
		  this.salary = newSalary;
	}

	public static int getEmpCount() {
		return empCount;
	}

    public static void setEmpCount(int empCount) {
		Employee.empCount = empCount;
	}

    public static double getTotalSalary() {
		return totalSalary;
	}

    public static void setTotalSalary(double totalSalary) {
		Employee.totalSalary = totalSalary;
	}

    public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

   @Override
public String toString() {
	// TODO Auto-generated method stub
	   
	return this.empCount+" "+ this.empName+" "+this.empId+" "+this.salary+" "+this.salaryRaised+" "+this.totalSalary;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		emp.setEmpName("Nidhi");
		emp.setEmpId(101);
		emp.setSalary(100000);
		emp.applyRaise(10);
		emp.calculateTotalSalaryExpense();
		
		 
		System.out.println(emp.toString());
		
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Sunita");
		emp1.setEmpId(102);
		emp1.setSalary(200000);
		emp1.applyRaise(10);
		emp1.calculateTotalSalaryExpense();
		
		System.out.println(emp1.toString());
		
		emp.updateSalary(150000);
		emp1.updateSalary(250000);
		
		System.out.println("udated salaay for"+emp.empId+" is :"+emp.getSalary());
		System.out.println("udated salaay for"+emp1.empId+" is :"+emp1.getSalary());
		

	}

}
