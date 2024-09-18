/**
*Exception is an issue / unexpected event / instance which occurs during execution of
*application.
*Exception is an instance which is used to acknowledge user of the system if any exeption
*situation occurs in the code.
If we want to manages OS resources carefully then we should use exception handling in Java.
 * we habe 2 type of exception in java
 * 1)Checked -  related with resource handeling & complier alway make it mandatory to try,
 * catch the checked exception
 * 
 * 2)Unchecked - no mandatory to implement try catched in uncheck exception
 * 
 *TRY WITH RESOURCE
 *
 *the class which implement Autocloaseable class those class is called resourse class and thier instance is called
 *resoure type, only recourse type class are allowed to declared in try ()
 *
 * We have to mentioned catch box*/

package demo1;

import java.util.Scanner;



public class Program1 {
	
	public static void main(String[] args) {
		try(Scanner sc=null;){
			System.out.println("Enter a number :");
			System.out.println(sc.nextInt());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Wrong code
	 * 
	 * public static void main1(String[] args) {
		try(Scanner sc=null;){
			System.out.println("Enter a number :");
			System.out.println(sc.nextInt());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	/***public static void main(String[] args) {
		try(String str = new String()){
			
		}*/
	

}
