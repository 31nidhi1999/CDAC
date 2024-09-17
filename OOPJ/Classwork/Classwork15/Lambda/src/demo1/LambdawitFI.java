/**
 * All this core 4 FI Predicate, Consumer, Supplier & Function are present in java.util package
 * 
 * how to remember the AM of core FI??
 * 
 * Predicate have test method which take parameter argument & return true or false according to condition
 * Consumer have accept method which take parameter args (basically acts as setter method) hence its return type is void
 * Supplier have get method which don't take any parameter args , but it have return type(acting like getter method)
 * Function have apply method which take parameter & return type(mixture of consumer & supplier FI) 
 * 
 * */


package demo1;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdawitFI {

	public static void main1(String[] args) {

		/**
		 * boolean test(T t) predicateFI AM
		 * To check given number odd or even
		 * */
		Predicate<Integer> perdicate = num1 -> num1%2==0;
		System.out.println("25 is odd number :"+perdicate.test(25));
		System.out.println("20 is even number :"+perdicate.test(20));

	}
	
	public static void main2(String[] args) {
		/**
		 * accept accept(T t) consumer FI AM
		 * accept the generic value & print
		 * */
		Consumer<String> consumer = str -> System.out.println(str+" welcome to consumer FI its a call from accept AM");
		consumer.accept("Nidhi");
		
		
		/**
		 * passing parameter type as LocalDate time & accept accept(T t) consumer FI AM
		 * */
		Consumer<LocalDateTime> consumer1 = date -> System.out.println(date.getDayOfMonth()+ " "+date.getMonthValue()+ " "+date.getYear());
		consumer1.accept(LocalDateTime.now());
	}
	
	
	public static void main3(String[] args) {
		/**
		 * R get() is Function FI AM & its return type is generic 
		 * */
		
		Supplier<Integer> supplier = ()->new Random().nextInt();
		System.out.println(supplier.get());
	}
	
	public static void main(String[] args) {
		/**
		 *R apply(T t) , T is parameter argument & R is the return type
		 * */
		Function<String, Integer> function = str->str.length();
		System.out.println(function.apply("anc fuioiokpop,op"));
		
	}

}
