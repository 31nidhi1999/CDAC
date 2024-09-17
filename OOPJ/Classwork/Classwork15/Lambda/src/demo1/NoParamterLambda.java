/**
 * Single Abstract Method: Functional interfaces have only one abstract method. This method
 * represents the behavior that can be implemented by lambda expressions or method
 * reference
 * 
 * The SAM/FI contain one abstract method & can contain multiple default or static method 
 * such abstract method is called as functional method
 * 
 * lambda was introduced in java 8, y to represent anonymous functions.
 * with the help of lambda expression we will be able to user functional interface
 *
 *For lambda expression no .class file is generated in compiler, in source code 
 *meanwhile in .class the invokedynamic instruction is present which invoke Lambda expression.
 *
 *and in .class a private static lambda method is created 
 *
 *we can declared n no.of LE in our SC
 *
 *in RT JVM create synthetic Class, this class is sub class of implemented I & the reference of the 
 *synthetic Class is passed to RT Functional I
 *
 *
 *We have 4 common FI/SAM in java
 *Predicate :: public interface Predicate<T> having AM 	test(T t) & its return type as boolean
 *
 *Consumer :: public interface Consumer<T> having AM accept(T t) & its return type as void
 *
 *Suplier :: public interface Supplier<T> havng AM 	get() T its return type as T()generic PT
 *
 *Function :: public interface Function<T,R> having AM 	apply(T t) its return type id R generic PT
 *
 *
 * */

package demo1;

interface Printablle{
	void print();
}

public class NoParamterLambda {

	public static void main(String[] args) {
		
		/**
		 * lambda with no parameter, the reference of synthetic Class is stored in Printablle RT whichis 
		 * having  p RV
		 * */
		Printablle p = ()->System.out.println("Printing from lambda expression");
		p.print();
	}

}
