package demo4;

import java.util.ArrayList;
import java.util.Date;

public class Program {
	 public static ArrayList<Object> getObjectList(){
		 ArrayList<Object> list = new ArrayList<Object>();
		 System.out.println("Object");
		 list.add(new String("Nidhi"));
		 list.add(new Date());
		 
		 return list;
	 }
	 
	 public static ArrayList<Number> getNumberList(){
		 ArrayList<Number> list = new ArrayList<Number>();
		 System.out.println("Number");
		 list.add(10);
		 list.add(10.0f);
		 
		 return list;
	 }
	 
	 public static ArrayList<Integer> getTntegerList(){
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 System.out.println("Integer");
		 list.add(100);
		 list.add(200);
		 
		 return list;
	 }
	 
	 public static ArrayList<Float> getFloatList(){
		 ArrayList<Float> list = new ArrayList<Float>();
		 System.out.println("Flaot");
		 list.add(1000.0f);
		 list.add(2000.0f);
		 
		 return list;
	 }
	 
	 public static ArrayList<String> getStringList(){
		 ArrayList<String> list = new ArrayList<String>();
		 System.out.println("String");
		 list.add("Nidhi");
		 list.add("Nayak");
		 
		 return list;
	 }
	 
	 public static void printObjectList(ArrayList<Object> list) {
		 for (Object element : list) {
			System.out.println(element);
		}
	 }
	 
	 public static void printNumberList(ArrayList<Number> list) {
		 for (Number element : list) {
			System.out.println(element);
		}
	 }
	 
	 public static void printIntegerList(ArrayList<Integer> list) {
		 for (Integer element : list) {
			System.out.println(element);
		}
	 }
	 
	 public static void printFlaotList(ArrayList<Float> list) {
		 for (Float element : list) {
			System.out.println(element);
		}
	 }
	 
	 
	 public static void printStringList(ArrayList<String> list) {
		 for (String element : list) {
			System.out.println(element);
		}
	 }
	
	public static void main(String[] args) {
		ArrayList<Object> objlist = Program.getObjectList();
		Program.printObjectList(objlist);
		
		ArrayList<Number> numList = Program.getNumberList();
		Program.printNumberList(numList);
		
		ArrayList<Integer> intList = Program.getTntegerList();
		Program.printIntegerList(intList);
		
		ArrayList<Float> fltList = Program.getFloatList();
		Program.printFlaotList(fltList);
		
		ArrayList<String> strList = Program.getStringList();
		Program.printStringList(strList);
	}
}
