/*Generics is a Java language feature which helps developer to write generic code by passing data
type as a agrument.

Generics gives us stronger typechecking at compile time. 

In other words, using generics we can write
type-safe generic code.It completly eliminates need of explict typecasting.

It helps developer to define generic algorithms and data structures.
*/

package deom1;

import java.util.Date;

//parameter type or ptye class
class Box<T>{
	private T object;
	
	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
}

public class Program1 {
	
	public static void main(String[] args) {
		/*
		 * if we specify type argument during reference declaration then specifying type
		 * argument during instantiation is optional. It is called as type inference.
		 */
		Box<Date> box = new Box();
		Date dt = new Date();
	   
		/*We must specify type argument during declaration of reference.
		 Box<> box1 = new Box<Date>();*/
		  
		/*
		 * We can not use inheritance for type argument. Box<Object> box2= new
		 * Box<Date>(); Box<Date> box2= new Box<Object>(); we get
		 */


		 
		
		box.setObject(dt);
		Date dt1=box.getObject();
		System.out.println(dt1);
	}
	
	public static void main2(String[] args) {
		
		
		/*
		 * During instantiation of parameterized type, type argument must be non
		 * primitive type. gives CTE
		 * 
		 * Box<int> box  =  new Box<int>();
		 */
		
		
		
		Box<Integer> box = new Box<Integer>();
		box.setObject(10);
		
		/**as we know, in our Object class we have instance of Integer wrapper class but when we 
		 * try to store instance in Date type reference variable compiler gives us error which 
		 * was not show in generic programming via java.lang.Object*/
		//Date dt=box.getObject();
		
		Integer integer = box.getObject();
		System.out.println(integer);
	}
	
	public static void main1(String[] args) {
		/*
		 * if we use parameterized type without type argument then it is called as raw
		 * type.
		 */
		Box box = new Box();
	}  
}
