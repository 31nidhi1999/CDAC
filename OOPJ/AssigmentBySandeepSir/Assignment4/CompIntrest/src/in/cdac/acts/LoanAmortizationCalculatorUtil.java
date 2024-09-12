package in.cdac.acts;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
static Scanner sc = new Scanner(System.in);
	
	LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
	
	public void acceptRecord() {
		System.out.println("Annual Rate of Intere5st ::");
		lac.setAnnualInterestRate(sc.nextDouble());
		
		
		System.out.println("Principe amt :");
		lac.setInitialInvestmentAmount(sc.nextDouble());
	
		
		System.out.println("Enter Compunding year :");
		lac.setNumberOfCompounds(sc.nextDouble());

		
		System.out.println("Loan tearm in years :");
		lac.setYears(sc.nextDouble());
		
	}
	
	public void printRecord() {
		System.out.println("Future Value :" + lac.getFutureValue());
		System.out.println("Total Interest"+ lac.getTotalInterest());
	}
	
	public static int  menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Display Record");
		return sc.nextInt();
	}
}
