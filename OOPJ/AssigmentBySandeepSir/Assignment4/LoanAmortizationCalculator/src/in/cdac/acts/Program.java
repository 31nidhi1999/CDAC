package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanAmortizationCalculatorUtil lacu  = new LoanAmortizationCalculatorUtil();
		
		int choice;
		while((choice=LoanAmortizationCalculatorUtil.menuList()) !=0) {
			switch (choice) {
			case 1:
				lacu.acceptRecord();
				break;
			case 2:
				lacu.printRecord();
				break;
			}
			
		}

	}

}
