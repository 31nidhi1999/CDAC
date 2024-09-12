/**
 *5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
 *Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in 
 *each subclass to start and stop the engines differently.*/

package in.assignmet5.Quest5;

import java.util.Scanner;

class Vehicle{
	public void startEngine(){}
	
	public void stopEngine() {}
}

class Car extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Car Engine started.");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Car Engine stoped.");
	}
}

class MotorCycle extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("MotorCycle started.");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("MotorCycle stoped");
	}
	
}

class VehicleUtil{
	private static Scanner sc = new Scanner(System.in);
	
	
	public void setInstance(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			Car c = new Car();
			c.startEngine();
			c.stopEngine();
		}else {
			MotorCycle mc =  new MotorCycle();
			mc.startEngine();
			mc.stopEngine();
		}
	}
	
	public static chooseVechicle chooseVechicle() {
		System.out.println("0.EXIT");
		System.out.println("1.CAR");
		System.out.println("2.MOTORCYCLE");
		
		return chooseVechicle.values()[sc.nextInt()];
	}
}

public class Program5 {

	public static void main(String[] args) {
		VehicleUtil vu = new 	VehicleUtil();
		chooseVechicle choice;
		
		while((choice=VehicleUtil.chooseVechicle())!=chooseVechicle.EXIT) {
			switch (choice) {
			case CAR: 
				vu.setInstance(new Car());
				break;
			case MOTORCYCLE:
				vu.setInstance(new MotorCycle());
				break;
			case EXIT:
				break;
			}
		}
		
		

	}
	
	

}
