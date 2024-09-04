package assigment2;

/*
 ***********
 *       *
  *     *
   *   *
    * *
     *
*/

public class InvertedHollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =6;
		for(int i =row;i>0;i--) {
			for(int j = 1; j<=row - i;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=2*i-1;k++) {
				
				
				if (k==1 || k == 2*i -1 || i==row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
