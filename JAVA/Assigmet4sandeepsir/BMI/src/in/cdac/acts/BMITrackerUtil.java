package in.cdac.acts;

import java.util.Scanner;

public class BMITrackerUtil {
static Scanner sc = new Scanner(System.in);
	
	BMITracker bt = new BMITracker();
	
	public void acceptRecord() {
		System.out.println("Enter the weight :");
		bt.setWeight(sc.nextFloat());
		
		System.out.println("Enter the height  :");
		bt.setHeight(sc.nextFloat());
	}
	
	public void printRecord() {
		System.out.println("bmi tracker:"+  bt.getBmi());
		System.out.println("BMI classy "+bt.getClassy());
	}
	
	public static int  menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Display Record");
		System.out.println("Enter number :");
		return sc.nextInt();
	}
}
