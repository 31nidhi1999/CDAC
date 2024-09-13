package demo1;

class Eployee {
	
	int empid;
	double salary;
	
	public Eployee( int id , double sal) {
		this.empid=id;
		this.salary=sal;
	}
	
	@Override
	public boolean equals(Object obj) {
		Eployee emp =(Eployee) obj;
		if(obj!=null) {
			if(this.empid==emp.empid)
				return true;
		   
		}
		 return false;
		
	}
	
	
}

public class program1 {
	public static void main(String[] args) {
		Eployee e = new Eployee( 101, 10000);
		
		Eployee e1 = new Eployee( 101, 10000);
		
		if(e.equals(e1)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}

}
