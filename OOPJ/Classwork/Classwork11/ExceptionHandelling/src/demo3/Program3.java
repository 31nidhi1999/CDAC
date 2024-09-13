/**
 * We have nested TRY WITH RESOURCE  in Java
 * 
 * if the exception generated logic is written in outer try block the outer catch block
 * will catch the exception
 * 
 * the exception generated in inner try block is catched by both inner & outer catch block
 * 
 * if inner catch block is able to catch the exception then outer blk will not get executed
 * 
 *  if inner catch blk not catched exception JVM will look in outer blk
 *  
 * */

package demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		//otter try with resouer
		try(Scanner sc = new Scanner(System.in)){
			int a = 10;
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			
			if(b==0)
				throw new ArithmeticException();
			System.out.println(a/b);
			
			//inner try with resouer
			try {
				System.out.println("Enter the value of c");
				int c = sc.nextInt();
				
				int arry[] = new int[-1];
				
			}
			//inner catch block
			catch (ArithmeticException e) {
				e.printStackTrace();
				
			}catch(InputMismatchException e) {
				System.out.println("Insided nexted catch");
				e.printStackTrace();
				
			}catch (Exception e) {
				System.out.println("Insided nexted catch");
				e.printStackTrace();
			}
			
		}//otter catch block
		catch (ArithmeticException e) {
			System.out.println("Outer try catch inside catch block");
			e.printStackTrace();
		}catch(NegativeArraySizeException e) {
			System.out.println("Outer try catch inside catch block");
			e.printStackTrace();
		}

	}

}
