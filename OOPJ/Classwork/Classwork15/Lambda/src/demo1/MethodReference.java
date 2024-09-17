/**
 * What we understand in method reference??
 * 
 * if any static & non static method present in class having similar return type & parameter just like abstract method in SAM
 * then just pass method reference to Reference type & call the Abstract method of Reference TYPE
 * 
 * In below we have tried Method reference with Integer class & one self define class(also a user can create a SAM I )
 * 
 * 
 * When to use Method reference & lambda expression?
 * 
 * When the existing logic is present at that time user Method reference 
 * When the existing logic is not present at that time used lambda expression
 * 
 * */


package demo1;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {

	
	public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> bifsum = Integer::sum;
			System.out.println("Giving Ineteger sum() regerence to BIFunction I :"+bifsum.apply(300, 1000));
	}
	
	public static Integer ArrayLenght(ArrayList<?> list) {
		
		return list.size();
	}
	
	public  Integer ArrLenght1(ArrayList<?> list) {

		return list.size();
	}
	
	
	
	public static void main1(String[] args) {
		
		ArrayList<Integer> ali = new ArrayList<>();
		ali.add(10);
		ali.add(20);
		ali.add(30);
		
		Function<ArrayList<?>, Integer> fuction = MethodReference::ArrayLenght;
		System.out.println("calling static method vai MethodReference :"+fuction.apply(ali));
		
		Function<ArrayList<?>, Integer> fun2 = new MethodReference()::ArrLenght1;
		System.out.println("calling non method vai MethodReference with anonymys instance:"+fun2.apply(ali));
		
		MethodReference mr = new MethodReference();
		Function<ArrayList<?>, Integer> fun3 = mr::ArrLenght1;
		System.out.println("calling non static  method vai MethodReference with FI Refernec type:"+fun3.apply(ali));

	}

}
