package org.example.main;

import org.example.demo.Employee;
import org.example.demo.Person;

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee("Nidhi", 25, 101, 100000);
		System.out.println(emp.toString());
		
		Person p1 = new Person("Devanna",47);
		System.out.println(p1);
		
		Person p = new Employee("Sunita", 45, 102, 105500);
		System.out.println(p);

		//Employee emp2 =(Employee) new Person("Xyz",70);  //java.lang.ClassCastException:
		//System.out.println(emp2);
		
		//Employee emp2 =new Person("Xyz",70);  //cannot convert from Person to Employee
				//System.out.println(emp2);
		
		//Employee emp3 = p; //cannot convert from Person to Employee
		//Employee emp3 = (Employee)p1;// //java.lang.ClassCastException:
		//System.out.println(emp3);
		
		Person p3 = emp;
		System.out.println(p3);
	}

}
