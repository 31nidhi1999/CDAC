//experiment with Instance variable & parameterized constructor

package orgs.example.domain1;

class Person{
	 String name;
	 int age;
	 
	 public Person() {
		System.out.println("Inside ZPC of Person");
	}
	 
	 public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}

class Employee extends Person{
	 int empId;
	 double salary;
	 
	 public Employee() {
		 super();
		//this(" ",0,0,0);
		//super(); constr call must be the first call in contructor
		System.out.println("Inside ZPC of Employee");
	}

	 public Employee(String name,int age,int id,double salary) {
		 super(name,age); //as we have not declared ZPC in Person class,hence iplcit super() gives CTE ::implict super constructor person() undefined
		this.empId=id;
		this.salary=salary;
	}
}

public class Program {

	public static void main(String[] args) {
		Employee e = new Employee("Nidhi",25,101,100000.0);
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.empId);
		System.out.println(e.salary);

	}

}
