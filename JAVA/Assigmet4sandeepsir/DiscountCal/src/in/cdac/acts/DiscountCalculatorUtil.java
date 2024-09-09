package in.cdac.acts;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	static Scanner sc = new Scanner(System.in);
	
	DiscountCalculator dc = new DiscountCalculator();
	
	public void acceptRecord() {
		System.out.println("Enter the original price :");
		dc.setOriginalPrice(sc.nextFloat());
		
		System.out.println("Enter the discount  :");
		dc.setDiscountRate(sc.nextFloat());
	}
	
	public void printRecord() {
		System.out.println("Discount price:"+  dc.getDiscountAmount());
		System.out.println("Final price "+dc.getFinalPrice());
	}
	
	public static int  menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Display Record");
		System.out.println("Enter number :");
		return sc.nextInt();
	}

}
