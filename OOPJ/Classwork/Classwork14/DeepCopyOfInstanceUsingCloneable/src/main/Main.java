/**
 * To create Shadow copy of instance we have to use clone() of java.lang.Object class(),
 * so we can create same structure to create new instance of same Class
 * 
 * Mostly when we done Date dt2 = dt1 then RT state i.e RV value get copied in dt2, but using clone() we are trying to create
 * same state instance in dt2(new instance similar structure to dt1), so the dt1!=dt2 in clone()
 * 
 * In java.lang.Object class the clone() is defined as protected, if we want to defined clone method in
 * sub class & used it any where we want to make it access modifier as public
 * 
 * As we are overriding clone() method from java.lang.Object its return type is Object, so whenever 
 * we override clone() we can change it return Type to implementing sub class name
 * 
 * The override clone method contain default statement as super.clone(), hence we have to 
 * store that super.close in Object RT & later we have to downcast the object RT to respective SUBCLASS RT
 * 
 * Also clone () throws CloneNotSupportedException exception is(CHECK EXCEPTION) we have to implement try catch block & 
 *  
 * 
 * 
 * */

package main;

import demo.Date;
import demo.Employee;

public class Main {
    
	public static void main(String[] args) {

		try {

			Employee emp = new Employee("Nidhi", 101, 548521.0,1, 1, 2024);
			
			Employee emp2 = emp.clone();
			
			System.out.println("Before ");
			System.out.println(emp.toString());
			System.out.println(emp2.toString());
			
			emp2.setName("Sunita");
			emp2.getDateOfJoinning().setDay(25);
			emp2.getDateOfJoinning().setMonth(4);
			emp2.getDateOfJoinning().setYear(2024);
			

			System.out.println("\nAfter ");
			System.out.println(emp.toString());
			System.out.println(emp2.toString());
			

			/*to check do it store RV of dt1 into dt2 via clone*/
			if(emp==emp2) 
				System.out.println("\nEquals");
			System.out.println("\nNot Equals");


			}catch(CloneNotSupportedException e) {
				e.printStackTrace();
		}

	}
}
	