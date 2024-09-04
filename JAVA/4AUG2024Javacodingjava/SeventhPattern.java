package assigment2;

public class SeventhPattern {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*loop to print
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5*/
		int row =5;
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			/* loop to print space*/
			for(int k=1;k<=2*(row -i)+1;k++) {
				System.out.print(" ");
			}
			
			/*	1
			   21
			  321
             4321
	        54321*/
			int m=i;
			for(int l= 1;l<=i;l++) {
				
				System.out.print(m);
				m--;
			}
			
			System.out.println("");
		}

	}
	

}
