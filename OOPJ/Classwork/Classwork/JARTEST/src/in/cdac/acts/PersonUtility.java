package in.cdac.acts;

import java.util.Scanner;

import in.cdac.domain.Address;
import in.cdac.domain.Date;
import in.cdac.domain.Employee;

public class PersonUtility {
	
	private static Scanner sc = new Scanner(System.in);
	static Employee emp = new Employee();
	
	public static void main(String[] args) {
		System.out.println("Enter emp id :");
		emp.setEmpId(sc.nextInt());
		
		System.out.println("Enter emp salary :");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		Address add = new Address();
		emp.setAdd(add);
		System.out.println("Enter the city :");
		add.setCity(sc.nextLine());
		
		System.out.println("Enter the state :");
		add.setState(sc.nextLine());
		
		System.out.println("Enter the pincode :");
		add.setPincode(sc.nextLine());
		
		Date d = emp.getD();
		System.out.println("Enter DayOJ :");
		d.setDay(sc.nextInt());
		
		System.out.println("Enter MonthOJ :");
		d.setMonth(sc.nextInt());
		
		System.out.println("Enter yearOJ :");
		d.setYear(sc.nextInt());
		
		
		System.out.println(emp.toString());
		
	}
	
	

}
