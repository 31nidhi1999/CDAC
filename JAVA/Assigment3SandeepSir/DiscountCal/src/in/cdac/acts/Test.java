package in.cdac.acts;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price ::");
		float price = sc.nextFloat();
		
		System.out.println("Enter discount percentage :");
		float per = sc.nextFloat();

		
		DiscountCalculator dc = new DiscountCalculator();
		
		dc.acceptRecord(price,per);
		
		dc.printRecord();

	}

}
