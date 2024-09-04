package assigment2;

public class EightPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =6;
	    /*
	     0
	     50
	     450
	     3450
	     23450
	     123450*/
		
		for(int i =1;i<=row;i++) {
			int w = row - i +1;
			int w1 =row -1;
			for(int j=1;j<=2*i-1;j++) {
				
				if(i==j) {
					System.out.print("0");
				}else if(j<=i-1) {
					System.out.print(w);
					w++;
				}else {
					System.out.print(w1);
					w1--;
				}
				
			}
			System.out.println();
		}
		
		
		/*
		 *54
		  543
		  5432
		  54321*/
		//for(int i =1;i<)
	}

}
