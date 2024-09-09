package in.cdac.acts;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	static Scanner sc = new Scanner(System.in);
	
	Calculator c =new Calculator();

	public void acceptRecord() {
		System.out.println("Annual Rate of Intere5st ::");
		c.setAnnualInterestRate(sc.nextDouble());
		
		
		System.out.println("Principe amt :");
		c.setPrincipal(sc.nextDouble());

		
		System.out.println("Loan tearm in years :");
		c.setLoanTerm(sc.nextDouble());
		
	}
	
	public void printRecord() {
		System.out.println("Future Value :" + c.getMonthlyPayment());
		System.out.println("Total Interest"+ c.getTotalAmt());
	}
	
	public static int  menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Display Record");
		return sc.nextInt();
	}
}
