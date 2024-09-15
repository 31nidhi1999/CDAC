/**
 * In the following program we are going to declare Interface
 * 
 * As we all know the super class of all the abstract class & concrete class(final / non final) the 
 * super class is java.Lang.Object
 * 
 * For the interfaces there is no super interface/class
 * 
 * What to declared inside Interface??
 * 
 *  Fields(the compiler implicit convert the fields to static & final so we have to defined the fields)
 *  
 *  Default Methods(default method have the method definition &we used default kw )
 *  
 *  Abstract Method(the complier implicitly convert the declared method method as abstract method & we need to  )
 * override those method in our sub class to define the sub class as concrete class otherwise we have to define our subclass as abstarct 
 * 
 * Nested classes
 * 
 * static interface method (can't override static method)
 * 
 * We can't create the Instance of Interface we need to create instance of its underlying sub classes
 * & can store those instance in Interface Reference Type.
 * 
 * We don't have condtrcutor inside interface
 * 
 * 
 *if the Interface contain only one abstact method then it is called as SAM(Single abstract method interface/ Funtional Interface)
 *and that singlee methos is called as Functional method / method descriptor
 *
 *example of SAM I prideicate, supplier, consure, fuction
 *
 * */

package demo1;

/*interface is keyword in java to defined interface
 * SAM interface
 * To check our interface is SAM or not then we have one annotation @FunctionalInterface
 * */
@FunctionalInterface
interface Simple{
	/*public static final filed defined with resperctive Datatype*/
	int i =10;
	
	/*static method*/
	static void simpleStatic() {
		System.out.println("Inside Simple Interface static method");
	}
	
	/*Default method with body & we used default kw*/
	default void simple() {
		System.out.println("Inside  Simple Interface default method");
	}
	
	/*public abstract void print()
	 * Functional method / method descriptor because we have single AM
	 * 
	 * */
	void print();
	
	/*Nested type
	class SimpleInner{
		private void simpleInner() {
			System.out.println("Inside Simple Inner class");
			}
	}*/
	
	
}

/*The class implemet all the properfy from interface hence we us implemet kw*/
class SimpleImpl implements Simple{
	@Override
	public void print() {
		System.out.println("Inside abstract method which is override by SimpleImpl class forcefully");
		
	}
}

/*as we not override the Simple interface abstarct method we need to define SimpleImp2 as abstract class*/
abstract class  SimpleImpl2 implements Simple{}

public class UndestandInterface {

	public static void main(String[] args) {
		
		/*We can store the sub class instance in Interface ref*/
		Simple s = new SimpleImpl();  //upcasting
		
		System.out.println(Simple.i);
		s.print();
		s.simple();
		Simple.simpleStatic();
		
		/* 
		 * Can;t crate instance of simple interface 
		 * 
		 * Simple s1 = new Simple(); */
		
		/*
		 * This is valid but to achieve lose coupling we need to upcaste the sub class instance to 
		 * interface ref 
		 *  
		 *  SimpleImpl sis = new SimpleImpl(); */
	}

}
