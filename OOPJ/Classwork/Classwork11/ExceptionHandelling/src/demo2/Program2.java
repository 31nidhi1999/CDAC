/**
 * q)we will learn about throw kw
 * throw is used to generation exception in a program
 * it is used by dev & JVM
 * throw is used to throw the instance/object of throwable sub class
 * it is like a jump statement when exception generated it jumps from that exception to the catch block
 **/

package demo2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = 10;
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			
			if(b==0)
				throw new ArithmeticException();
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
