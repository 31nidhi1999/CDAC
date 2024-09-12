package in.cdac.acts;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	
	static Scanner sc = new Scanner(System.in);
	
	TollBoothRevenueManager tbm =  new TollBoothRevenueManager();
	
	public void acceptRecord() {
		System.out.println("Enter the no of cards :");
		tbm.setnoOfCars(sc.nextInt());
		
		System.out.println("Enter card rate :");
		tbm.setRateCar(sc.nextDouble());
		
		
		System.out.println("Enter the no of Truck :");
		tbm.setnoOfTruck(sc.nextInt());
		
		System.out.println("Enter Truck rate :");
		tbm.setRateTruck(sc.nextDouble());
		
		
		System.out.println("Enter the no of Mc :");
		tbm.setnoOfCMc(sc.nextInt());
		
		System.out.println("Enter card rate :");
		tbm.setRateMc(sc.nextDouble());
		
		
	}
	
	public void printRecord() {
		System.out.println("Total no of vehicle :"+tbm.getTotalNoOfVechile());
		System.out.println("Total revenue :"+tbm.totalRevanue());
	}
	
	public static int  menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Display Record");
		System.out.println("Enter number :");
		return sc.nextInt();
	}

}
