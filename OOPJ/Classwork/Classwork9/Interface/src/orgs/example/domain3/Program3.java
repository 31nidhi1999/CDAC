//experiment with Instance method
package orgs.example.domain3;

class Person{
	 String name;
	 int age;
	 static String citizenship="India";
	
	 
	 public Person(String name, int age) {
			this.name=name;
			this.age=age;
		}
	 
	 public void show() {
		 System.out.println("Ctizenship :"+Person.citizenship);
	 }
	 
	 public void display() {
		 System.out.println("name :" + this.name);
		 System.out.println("Age :"+ this.age);
	 }
}

class Employee extends Person{
	 int empId;
	 double salary;
	 
	 public Employee(String name,int age,int id,double salary) {
		 super(name,age); //as we have not declared ZPC in Person class,hence iplcit super() gives CTE ::implict super constructor person() undefined
		this.empId=id;
		this.salary=salary;
	}
	 
	 public void display() {
		 
		 super.display(); //we have used super kw to call Supper class display()
		 this.show(); //when we have two diffremt method name then we can use this kw
		 System.out.println("empid :" + this.empId);
		 System.out.println("salary :"+ this.salary);
	 }
	
}

public class Program3 {

	public static void main(String[] args) {
		Employee emp = new Employee("Nidhi",25,101,125634);
		emp.display();
	}

}
