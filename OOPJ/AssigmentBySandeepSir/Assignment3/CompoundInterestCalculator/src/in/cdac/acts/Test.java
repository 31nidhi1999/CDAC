package in.cdac.acts;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Annual Rate of Intere5st ::");
		double rate = sc.nextDouble();
		
		System.out.println("Principe amt :");
		double amt = sc.nextDouble();
		
		System.out.println("Enter Compunding year :");
		double cn = sc.nextDouble();
		
		System.out.println("Loan tearm in years :");
		double year = sc.nextInt();
		
		Calculator c = new Calculator();
		
		c.acceptRecord(rate, amt, cn,year);
		
		c.printRecord();

	}

}
