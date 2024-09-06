package in.cdac.acts;

public class Calculator {
	
		double principal;
		double monthlyPayment;
		double numberOfMonths;
		double loanTerm;
		double annualInterestRate;
		double monthlyInterestRate;
		double totalAmt;
		
		
		void acceptRecord(double yearlyRate,double amt,double year) {
			annualInterestRate=yearlyRate;
			principal = amt;
			loanTerm=year;
			
		}
		
		double monthlyPaymentCal() {
			
			monthlyInterestRate = annualInterestRate / 12 / 100;
			numberOfMonths = loanTerm * 12;
			monthlyPayment = principal * (monthlyInterestRate *(1+Math.pow(annualInterestRate, numberOfMonths)))/(1+Math.pow(annualInterestRate, numberOfMonths)-1);
			return monthlyPayment;
		}
		
		double totalAmtCal() {
			totalAmt = monthlyPaymentCal()*12*loanTerm + principal;
			return totalAmt;
		}
		
		void printRecord() {
			
			System.out.println("Montly Payment :"+ monthlyPaymentCal());
			System.out.println("TotalAmount to be paid :"+ totalAmtCal());
			
			
		}
		
	
	
	
	
	
	

}
