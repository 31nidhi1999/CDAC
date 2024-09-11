//can we inherit private member in program??
/**
 the private instance meber get space in sub class instance and we can access via getter & setter mthod*/
package orgs.example.domain5;

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Employee extends Person{
	
}

public class Program5 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//System.out.println(emp.name); because of the private access modifiers, the person is visible 
		//System.out.println(emp.age); 
		
		emp.setAge(25);
		emp.setName("Name");
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		

	}

}
