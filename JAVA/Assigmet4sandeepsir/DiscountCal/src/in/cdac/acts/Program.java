package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculatorUtil dcu = new DiscountCalculatorUtil();
		
		
	    int choice;
		while((choice=DiscountCalculatorUtil.menuList()) !=0) {
			switch (choice) {
			case 1:
				dcu.acceptRecord();
				break;
			case 2:
				dcu.printRecord();
				break;
			}
			
		}

	}

}
