package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManagerUtil tbmu = new TollBoothRevenueManagerUtil();
		
		
	    int choice;
		while((choice=TollBoothRevenueManagerUtil.menuList()) !=0) {
			switch (choice) {
			case 1:
				tbmu.acceptRecord();
				break;
			case 2:
				tbmu.printRecord();
				break;
			}
			
		}

	}

}
