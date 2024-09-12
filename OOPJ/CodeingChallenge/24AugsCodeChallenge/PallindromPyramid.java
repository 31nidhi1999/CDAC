package assigment2;

public class PallindromPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1;i<=5;i++) {
			/*space*/
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			/*
			    1
			   12
			  123
			 1234
			12345
 */
			for(int k = 1;k<=i;k++) {
				System.out.print(k);
			}

			/*
			 space
			 1
			 21
			 321
			 4321*/
			int w = i-1;
			for(int l =1;l<i;l++) {
				System.out.print(w);
				w--;
			}
			System.out.println("");
		}

	}

}
