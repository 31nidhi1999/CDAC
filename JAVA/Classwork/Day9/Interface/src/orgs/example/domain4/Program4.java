//inner calss in interface

package orgs.example.domain4;

class Person{
	class Date{
		public void print() {
			System.out.println("Date is nested class in Person class");

		}
	}
}
class Employee extends Person{
	
}

public class Program4 {

	public static void main(String[] args) {
		
		Employee.Date ed = new Employee().new Date();
		ed.print();
		
		Person.Date pd = new Person().new Date();
		pd.print();
	}

}
