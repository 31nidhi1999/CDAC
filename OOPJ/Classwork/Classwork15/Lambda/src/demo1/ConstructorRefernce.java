/**
 * similar to method reference we can also pass constructor to Functional I with the help of new kw
 * 
 * in method reference the already existing defined method was having similar return & parameter type 
 * like Function I abstract method, here also the Constructor must contain similar parameter like functional method otherwise 
 * constructor reference will not work
 * 
 * */


package demo1;

@FunctionalInterface
interface Sample{
	Employee get(String name, int age);
}

class Employee{
	
	private int age;
	private String name;
	
	public Employee(String name, int age) {
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.age;
	}
}

public class ConstructorRefernce {
	

	public static void main1(String[] args) {
		
		Sample s = (name, age) -> {
			return new Employee(name,age);
		};

		Employee emp = s.get("Nidhi", 25);
		System.out.println(emp);
	}
	
	/**
	 * constructor reference
	 *shortcut for main1()
	 * */
	public static void main(String[] args) {
		Sample s = Employee::new;  
		Employee emp = s.get("Sunita", 53);
		System.out.println(emp);
	}

}
