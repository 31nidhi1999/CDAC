package in.cdac.acts;

public class LoanAmortizationCalculator {
	double initialInvestmentAmount;
	double annualInterestRate;
	double numberOfCompounds;
	double years;
	double futureValue;
	double totalInterest;
	
	public double getInitialInvestmentAmount() {
		return initialInvestmentAmount;
	}


	public void setInitialInvestmentAmount(double initialInvestmentAmount) {
		this.initialInvestmentAmount = initialInvestmentAmount;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public double getNumberOfCompounds() {
		return numberOfCompounds;
	}


	public void setNumberOfCompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}


	public double getYears() {
		return years;
	}


	public void setYears(double years) {
		this.years = years;
	}


	public double getFutureValue() {
		return calculateFutureValue();
	}


	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}


	public double getTotalInterest() {
		return totalInterestEarned();
	}


	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}


	public LoanAmortizationCalculator() {
		this(0.0,0.0,0.0,0.0);
	}
	
	
	public LoanAmortizationCalculator(double rate,double amt,double cn,double year ) {
		// TODO Auto-generated constructor stub
		annualInterestRate = rate;
		initialInvestmentAmount =amt;
		numberOfCompounds=cn;
		this.years =year;
	}
	
	
	//business logic
   double calculateFutureValue() {
		
		futureValue = getInitialInvestmentAmount()*Math.pow((1+ getAnnualInterestRate()/getNumberOfCompounds()), (getNumberOfCompounds()*getYears()));
		return futureValue;
	}
	
	double totalInterestEarned() {
		totalInterest = getFutureValue() - getInitialInvestmentAmount();
		return totalInterest;
	}
}
