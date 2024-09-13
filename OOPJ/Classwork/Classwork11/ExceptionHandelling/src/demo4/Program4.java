/**
 * we have a throws kw in java it is used to redirect the exception occured in method
 * to the try catch block where the method is being called
 * 
 * it is mandatory to catch checked exception and to implement try catched block
 * 
 * 
 * */

package demo4;

public class Program4 {
	
	
	//check exception
	public static void display() throws InterruptedException {
		for(int i = 0;i<=10;i++) {
			 if(i==9)
				throw new InterruptedException();
			System.out.println(i);
			Thread.sleep(100);
		}
	}
	
	
	//unchecked exception
	public static void display1() {
		String str = "Nidhi";
		int i = Integer.valueOf(str);
	}
	
	//unchecked exception
	public static void main2(String[] args) {
		//Program4.display1();
	}
	
	public static void main1(String[] args) {
		try {
				Program4.display1();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
	//try catch blk to to catched checked exception
	public static void main(String[] args) {
		try {
			Program4.display();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
