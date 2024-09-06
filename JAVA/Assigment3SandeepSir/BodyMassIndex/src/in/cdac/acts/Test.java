package in.cdac.acts;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Weight in Kg ::");
		float weight = sc.nextFloat();
		
		System.out.println("Enter height in Meter :");
		float height = sc.nextFloat();

		
		BMITracker bmi = new BMITracker();
		
		bmi.acceptRecord(weight,height);
		
		bmi.printRecord();

	}

}
