/**
 * We can define class inside scope of another class. It is called as nested class.
 * The outer class is called as Top level class.
 * 
 * Access modifier of top level class can be either package level private or public only but we can use
any access modifier on nested class.
n   
 * 
 * We have 2 types of Inner classes
 * 1)Non static nested class/Inner class
 * 2)Static nested  Class
 * 
 * The .class file name generated for below inner class is Outter$Inner.class
 * 
 * To handel static nested  & inner class handel them a as static & non static method
 * */

package demo1;

import demo1.Outter.Inner;

class Outter{
	private int num1 =10;
	private static int num2 = 20;
	
	class Inner{
		private int num3 = 30;
		private static int num4 =40;
		
		public void print() {
			System.out.println("\ninside inne class method :");
			System.out.println("Num1 :"+num1);
			System.out.println("Num1 :"+Outter.this.num1);
			System.out.println("Num2 :"+Outter.num2);
			System.out.println("Num3 :"+this.num3);
			System.out.println("Num4 :"+Inner.num4);
		}
		
		public int getNum3() {
			return num3;
		}
		
		public static int getNum4() {
			return num4;
		}
		
		public int getNum1() {
			return num1;
		}
		
		public static int getNum2() {
			return num2;
		}
		
		
	}
	
	
	public void print() {
		System.out.println("Num1 :"+this.num1);
		System.out.println("Num2 :" +Outter.num2);
		Inner in = new Inner();
		System.out.println("num3 :"+in.num3);
		System.out.println("num4 :"+Inner.num4);
	}
}

public class Program1 {

	public static void main(String[] args) {
		
		/**ways to instancinate Inner class*/
		System.out.println("Way 1 :");
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		out.print();
		in.print();
		
		System.out.println("\nWay 2 :");
		Outter.Inner in1 = new Outter().new Inner();
		
		System.out.println("Num3 :"+in1.getNum3());
		System.out.println("Num4 :"+Inner.getNum4());
		System.out.println("Num2 :"+Inner.getNum2());
		System.out.println("Num1 : "+in1.getNum1());
		
		
		
		

	}

}
