//**Exception channing*/

package demo6;

class A{
	public  void display() {
		
	}
}

class B extends A{
	
	//check exception
	public  void display()throws RuntimeException {
		try {
			for(int i = 0;i<=10;i++) {
				 if(i==9)
					throw new InterruptedException();
				System.out.println(i);
				Thread.sleep(100);
			}
		}catch(InterruptedException cause) {
			throw new RuntimeException(cause);
		}
		
		

	}
}

public class Program6 {

	public static void main(String[] args) {
		try {
			A a = new B();
			a.display();
		}catch (RuntimeException e) {
			Throwable tw = e.getCause();
			System.out.println(tw);
		}

	}

}
