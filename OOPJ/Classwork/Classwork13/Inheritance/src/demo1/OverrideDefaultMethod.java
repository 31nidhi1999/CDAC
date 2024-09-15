/*
 * In  default method if multiple I/single AC which implemets/esxtend to subclass & all of 
 * them contain same default method defination  then it is compuslory to overrride that common method 
 * otherwise gives CTE :: Duplicate detalut method inheritate from above I /ac
 * 
 * Meanwhile default method help us to now to defined abstract helper class hence reduces time of developer
 * 
 * if we are using any helper method in interface mentioned those method as static hence those method will not get ovveride in sub class/I
 * 
 * */

package demo1;

interface A3{
	default void f1() {
		System.out.println("A3.f1()");
	};
	default void f3() {
		System.out.println("A3.f3()");
	};
}

interface B3{
	default void f2(){
		System.out.println("B3.f2()");
	};
	default void f3(){
		System.out.println("B3.f3()");
	};
}

/*
 * interface D extends A3,B3{
 * 
 * }
 */

/*Implemeted common method*/
class C3 implements A3,B3{
	
	  @Override public void f3() { System.out.println("C3.f3()"); }
	 
}

public class OverrideDefaultMethod {

	public static void main(String[] args) {

		A3 a = new C3();
		a.f1();
		a.f3();
		
		B3 b = new C3();
		b.f2();
		b.f3();

	}

}
