/**
 * Reflection in Java is a feature that allows a program to examine or modify the behavior of a class,
 * method, or object at runtime.
 *
 *Obtain information about the class at runtime, such as its name, superclass, implemented
 *interfaces, constructors, methods, and fields.
 *
 *Create new objects of a class dynamically, without knowing the class name at compile time.
 *
 *Access and modify the values of fields in an object, even if they are declared as private.
 *
 *Invoke methods on an object dynamically, without knowing the method names at compile time
 * 
 * in java Reflection API help is 
 * 
 * Class has no public constructor. Instead Class objects are constructed automatically by the Java Virtual Machine as 
 * classes are loaded and by calls to the defineClass method in the class loader.
 * 
 * concreate class can be defined in 3 different ways
 * 
 * */



package demo1;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;

public class GetClassReference {
	public static void main1(String[] args) {
		
		/**
		 * if the class is concrete class & we know at CT that we will user the class
		 * */
		
		Date date  = new Date();
		Class<?>cls = date.getClass();
		System.out.println(cls);            //class java.util.Date

	}
	
	public static void main2(String[] args) {
		/**
		 * we know we can't create instance of AC or I but we will get but via reflection API 
		 * */
		Class<?> cls = Number.class;
		Class<?> cls1 = Function.class;
		Class<?> cls3 = GetClassReference.class;
		
		System.out.println(cls);	//class java.lang.Number
		System.out.println(cls1);	//interface java.util.function.Function\
		System.out.println(cls3);   //class demo1.GetClassReference
	}
	
	public static void main(String[] args) {
		/**
		 * we we have to bring our  class at Run Time in picture
		 * */
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter class name ::");
			String clsname = sc.nextLine();
			Class<?> cls = Class.forName(clsname);
			System.out.println(cls); 				//class javax.swing.border.AbstractBorder

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
