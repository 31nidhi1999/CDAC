/**
 * When we override interface / abstract /class method & we provide instance of the sub class to the 
 *RT of Interface/abstract/class(UPPER CASTING)  then it is call RTP, dynamic method Dispatched
 * 
 * if we defined same filed name in 2 diffrent interface & try to access via sub class it giving
 * ambigous CTE, but it is not in the case of method overloading
 * 
 * Whatever refence type given but the overrided method will get executed from the instance provided to RT
 * 
 * */

package demo1;

interface A1{
	void f1();
	void f3();
}

interface B1{
	void f2();
	void f3();
}

abstract class Test{
	abstract void f3();
}

class ABTestImpl extends Test implements A1,B1{
	@Override
	public void f1() {
		System.out.println( "C.f1()");
	}
	
	@Override
	public void f2() {
		System.out.println("C.f2()");
		
	}
	
	@Override
	public void f3() {
		System.out.println("C.f3()");
		
	}
}

public class ExtendImplemetclsInter {

	public static void main(String[] args) {
		ABTestImpl abi = new ABTestImpl();
		System.out.println();
		abi.f1();
		abi.f3();
		
		System.out.println();
		abi.f2();
		abi.f3();

		System.out.println();
		abi.f1();
		abi.f2();
		abi.f3();
	}

}
