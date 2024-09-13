//final and abstarct classes

/**
 * Abstract class may or may not contain abstract method
 * but if user declared a abstract method then we have to make the class as abstract
 * the class which is sub class of abstarct class need to implement the abstract method 
 * We can't create the instance of abstract class.
 * A a = new A(); not allowed
 * But in abstract class ref we can initiazlize sub class instance
 * 
 * 
 * final is a concreate class we can create instance of final class
 * the final method can't get override in sub class but it will get inheritate
 * 
 * 
 * 
 */

package demo1;

abstract class A{
	public final void f1() {
		System.out.println("A.f1");
	}
	
	public void f2() {
		System.out.println("A.f2");
	}
	
	public abstract void p3();
	public abstract void p6();

	}

//helper abstract class
abstract class AHelper extends A{	
	@Override
	public void p3() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void p6() {
		// TODO Auto-generated method stub
		
	}

}


class B extends AHelper{
	@Override
	public void p6() {
		System.out.println("B.p6");
	}
	
	@Override
	public void p3() {
		System.out.println("B.p3");
	}
	
	@Override
	public final void f2() {
		System.out.println("B.f2");
	}
}

final class C extends B{
	@Override
	public final void p3() {
		System.out.println("C.p3");
	};
	
	public void p4() {
		System.out.println("C.p4");
	};
	
}

public class Program {
	public static void main(String[] args) {
		//A a = new A(); can't create abstract class instance
		System.out.println("class B with B instance:");
		B b = new B();
		b.f1();
		b.f2();
		b.p3();
		
		System.out.println("\nclass c with c instance:");
		C c = new C();
		c.f1();
		c.f2();
		c.p3();
		c.p4();
		
		System.out.println("\nclass A with B instance:");
		A a = new B();   //upcasting
		a.f1();
		a.f2();
		a.p3();
		
		
		System.out.println("\nclass A with c instance:");
		A a1 = new C(); //upcasting
		a1.f1();
		a1.f2();
		a1.p3();
	
	}

}
