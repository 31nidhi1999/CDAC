/**
 * sole constructor
 * as we know when the class is abstract we can create the instance for those classes.
 * to call those abstract constructor we call through sub class constructor
 * */


package demo1;

abstract class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age;
			
	}
}

class Eployee extends Person{
	
	int empid;
	double salary;
	
	public Eployee(String name, int age, int id , double sal) {
		super(name, age);
		this.empid=id;
		this.salary=sal;
	}
	@Override
	public String toString() {

		return super.toString() +" "+this.empid+" "+this.salary;
	}
	
}


public class Program1 {
	
	public static void main(String[] args) {
		Eployee e = new Eployee("nidhi", 25, 101, 10000);
		System.out.println(e);
		
		Person p = new Eployee("sunita", 45, 102, 150000);
		System.out.println(p);
	}

}
