package demo6;

import java.util.ArrayList;
import java.util.Date;

import demo4.Program;

public class Program7 {
	
	 public static ArrayList<Object> getObjectList(){
		 ArrayList<Object> list = new ArrayList<>();
		 System.out.println("Object");
		 list.add(new String("Nidhi"));
		 list.add(new Date());
		 
		 return list;
	 }
	 
	 public static ArrayList<Number> getNumberList(){
		 ArrayList<Number> list = new ArrayList<Number>();
		 System.out.println("\n\nNumber");
		 list.add(10);
		 list.add(10.0f);
		 
		 return list;
	 }
	 
	 public static ArrayList<Integer> getTntegerList(){
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 System.out.println("\nInteger\\n");
		 list.add(100);
		 list.add(200);
		 
		 return list;
	 }
	 
	 public static ArrayList<Float> getFloatList(){
		 ArrayList<Float> list = new ArrayList<Float>();
		 System.out.println("Flaot\n");
		 list.add(1000.0f);
		 list.add(2000.0f);
		 
		 return list;
	 }
	 
	 public static ArrayList<String> getStringList(){
		 ArrayList<String> list = new ArrayList<String>();
		 System.out.println("String\n");
		 list.add("Nidhi");
		 list.add("Nayak");
		 
		 return list;
	 }

	 public static void printList(ArrayList<? extends Number> list) {
			for(Object element : list) {
				System.out.println(element);
			}
		}

	public static void main(String[] args) {
		/*
		 * ArrayList<Object> objlist = Program.getObjectList();
		 * Program7.printList(objlist);
		 * 
		 * ArrayList<String> strList = Program.getStringList();
		 * Program7.printList(strList);
		 */
		
		ArrayList<Number> numList = Program.getNumberList();
		Program7.printList(numList);
		
		ArrayList<Integer> intList = Program.getTntegerList();
		Program7.printList(intList);
		
		
		  ArrayList<Float> fltList = Program.getFloatList();
		  Program7.printList(fltList);
		  
		  
		 
	}

}
