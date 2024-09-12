package in.cdac.acts;

public class Calculator {
	double principal;
	double monthlyPayment;
	double numberOfMonths;
	double loanTerm;
	double annualInterestRate;
	double monthlyInterestRate;
	double totalAmt;
	
	
	/*ZPC*/
	public Calculator() {
		this(0.0,0.0,0.0);
	}
	
	/*PC*/
	public Calculator(double yearlyRate,double amt,double year) {
		annualInterestRate=yearlyRate;
		principal = amt;
		loanTerm=year;
	}
	
	//business logic
	double CalMonRate() {
		return annualInterestRate / 12 / 100;
	}
	
	double CalMothter() {
		return loanTerm * 12;
	}
	
	double monthlyPaymentCal() {
		 
		monthlyPayment = principal * (getPrincipal() *(1+Math.pow(CalMonRate(), CalMothter())))/(1+Math.pow(CalMonRate(), CalMothter())-1);
		
		return monthlyPayment;
	}
	
	double totalAmtCal() {
		totalAmt = monthlyPaymentCal()*12*getLoanTerm() + getPrincipal();
		return totalAmt;
	}
	
	/*SETTER AND GETTER*/
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getMonthlyPayment() {
		return monthlyPaymentCal();
	}
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public double getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public double getLoanTerm() {
		return CalMothter();
	}
	public void setLoanTerm(double loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getAnnualInterestRate() {
		return CalMonRate();
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	public double getTotalAmt() {
		return totalAmtCal();
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
}
