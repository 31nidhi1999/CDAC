/**
 * try to throw check exception directly or indirectly by exception class
 * */

package demo5;

class A extends Exception{}
class B extends Exception{}
class C extends Exception{}

class Test {

	public static void record(int num) throws A,B,C {
		if(num==0)
			throw new A();
		if(num==1)
			throw new B();
		if (num==2)
			throw new C();
			
	}
	
	public static void dispaly(int num)throws Exception{
		if(num==0)
			throw new A();
		if(num==1)
			throw new B();
		if (num==2)
			throw new C();
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		try {
			Test.dispaly(0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//try catch block for check exception A,B,C(sub class)
	public static void main1(String[] args) {
		try {
			Test.record(1);
		}catch (A| B | C e) {
			e.printStackTrace();
		}
		
		

	}

}
