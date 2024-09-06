package in.cdac.acts;

public class Calculator {
	
	double initialInvestmentAmount;
	double annualInterestRate;
	double numberOfCompounds;
	double years;
	double futureValue;
	double totalInterest;
	
	void acceptRecord(double rate,double amt,double cn,double year) {
		annualInterestRate = rate;
		initialInvestmentAmount =amt;
		numberOfCompounds=cn;
		this.years =year;
	}
	
	double calculateFutureValue() {
		
		futureValue = initialInvestmentAmount*Math.pow((1+ annualInterestRate/numberOfCompounds), (numberOfCompounds*years));
		return futureValue;
	}
	
	double totalInterestEarned() {
		totalInterest = futureValue - initialInvestmentAmount;
		return totalInterest;
	}
	
	void printRecord() {
		System.out.println("Future Value :" + calculateFutureValue());
		System.out.println("Total Interest"+ totalInterestEarned());
	}
	
}
