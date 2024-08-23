/*        I  s r
********* 1  0 9
 *******  2  1 7
  *****	  3    5
   ***	  4    3
	*     5    1
   ***
  *****
 *******
*********

*/

class Partern13 { 
	public static void main(String[] args) { 
	    int row =5;
	    for(int i =1; i<=row -1;i++){
			for(int j =1; j<= i - 1;j++){
					System.out.print(" ");
			}
			for(int k = 1; k<=2*(row -i) + 1; k++){
				System.out.print("*");
			}
			
		
			System.out.println("");
		}
	
	
		 
		for(int i =1; i<=row;i++){
			for(int j =1; j<= row -i ;j++){
					System.out.print(" ");
			}
			for(int k = 1; k<=2*i -1; k++){
				System.out.print("*");
			}
		
			System.out.println("");
		}
	} 
}