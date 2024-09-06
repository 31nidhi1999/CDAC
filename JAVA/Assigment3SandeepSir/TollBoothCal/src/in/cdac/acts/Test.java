package in.cdac.acts;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TollBothCalculator tbc1 = new TollBothCalculator();
		
		
		System.out.println("Enter Car Rate ::");
		double rate = sc.nextDouble();
		
		System.out.println("Enter total no of cars :");
		int  per = sc.nextInt();
;
		
		System.out.println("Enter Truck Rate ::");
		double rate1 = sc.nextDouble();
		
		System.out.println("Enter total no of Truck :");
		int  per1 = sc.nextInt();

		
		
		System.out.println("Enter Motor Cycle Rate ::");
		double rate3 = sc.nextDouble();
		
		System.out.println("Enter total no of Motor Cycle :");
		int  per3 = sc.nextInt();

		tbc1.acceptRecord(rate,per,rate1, per1,rate3,per3);
		
		
		tbc1.printRecord();

	}

}
