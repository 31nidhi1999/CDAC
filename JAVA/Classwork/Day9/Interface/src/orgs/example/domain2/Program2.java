//experiment with static member

package orgs.example.domain2;

class Person{
	 String name;
	 int age;
	 static String citizenShip="India";
	 public static void show() {
		 System.out.println("From class Person :"+citizenShip);
	 }
}

class Employee extends Person{
	 int empId;
	 double salary;
	 static String companyName="Coupa";
	 
	 public static void display() {
		 System.out.println("From class Employee :"+companyName);
	 }
}

public class Program2 {
	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		System.out.println(Employee.citizenShip);
		
		//System.out.println(Person.companyName); super class don't contain member of sub class
		System.out.println(Person.citizenShip);
		
		Employee.display();
		Employee.show();
		
		//Person.display();  the display() is undefined in Person class
		Person.show();


	}

}
