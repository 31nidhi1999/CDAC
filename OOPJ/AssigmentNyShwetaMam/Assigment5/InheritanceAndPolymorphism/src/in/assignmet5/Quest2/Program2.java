/**
 * 2)	Create a base class Vehicle with attributes like make and year. 
 * Provide a constructor in Vehicle to initialize these attributes. 
 * Derive a class Car that has an additional attribute model and write a constructor that initializes make, 
 * year, and model. 
 * Write a program to create a Car object and display its details.*/

package in.assignmet5.Quest2;

class Vehicle{
	private String make;
	private int year;
	
	public Vehicle(String make, int year) {
		this.make=make;
		this.year=year;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getYear() {
		return year;
	}
	
}

class Car extends Vehicle{
	private String model;
	
	public Car(String make, int year, String model) {
		super(make,year);
		this.model=model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void carDeatils() {
		System.out.println("Make :" + this.getMake());
		System.out.println("Year :"+this.getYear());
		System.out.println("Model :"+this.getModel());
	}
}

public class Program2 {

	public static void main(String[] args) {
		
		Car c = new Car("Honda", 2018, "Civic Sport Touring");
		
		System.out.println("Car 1 Deatils :");
		c.carDeatils();
		
		

	}

}
