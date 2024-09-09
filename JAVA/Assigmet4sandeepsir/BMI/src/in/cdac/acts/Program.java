package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMITrackerUtil bu = new BMITrackerUtil();
		
		int choice;
		while((choice=BMITrackerUtil.menuList()) !=0) {
			switch (choice) {
			case 1:
				bu.acceptRecord();
				break;
			case 2:
				bu.printRecord();
				break;
			}
			
		}

	}

}
