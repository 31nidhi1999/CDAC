/**
 * In java.lang.Object class the clone() is defined as protected, if we want to defined clone method in
 * sub class & used it any where we want to make it access modifier as public ()
 * 
 * As we are overriding clone() method from java.lang.Object its return type is Object, so whenever 
 * we override clone() we can change it return Type to implementing sub class name
 * 
 * The override clone method contact default statement as super.clone(), hence we have to 
 * store that super.close in Object RT & later we have to downcast the object RT to respective SUBCLASS RT
 *
 * Also clone () throws CloneNotSupportedException exception if we not implement Cloneable I
 * 
 *  Cloneable I is a marked Interface which doesn't contain any filed,method
 *  
 *  Shawdow copy of instance is used for creating instance of PT
 * 
 * */

package demo;

import java.time.LocalDateTime;



public class Date implements Cloneable {
	
	private int day;
	private int month;
	private int year;

	 public Date() {
		 LocalDateTime ldt = LocalDateTime.now();
		 this.day = ldt.getDayOfMonth();
		 this.month = ldt.getMonthValue();
		 this.year = ldt.getYear();
	}
	 
	 public Date(int date, int month, int year){
		 this.day = date;
		 this.month = month;
		 this.year=year;
	 }
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		
		return this.day+"/"+this.month+"/"+this.year;
	}
	
	@Override
	public Date clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return (Date)obj;
	}
}
