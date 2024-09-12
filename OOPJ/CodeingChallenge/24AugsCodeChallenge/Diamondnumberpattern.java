package assigment2;

public class Diamondnumberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =4;

		for(int i =1;i<=row;i++) {
			/*space*/
			for(int j =1;j<=row - i;j++) {
				System.out.print(" ");
			}
			/*
			 	1
			   12
			  123*/
			for(int  k =1;k<=i;k++) {
				System.out.print(k);
			}
			/*
			  1
			 21*/
			int w = i- 1;
			for(int l =1 ;l<i;l++) {
				System.out.print(w);
				w--;
			}

			System.out.println();
		}

		for(int i =row - 1;i>0;i--) {
			/*space*/
			for(int j =1;j<=row - i;j++) {
				System.out.print(" ");
			}

			/*123
			  12
			   1*/
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			/*21
			  1*/
			int w= i-1;
			for(int l =1;l<i;l++) {
				System.out.print(w);
				w--;
			}

			System.out.println();
		}


	}

}
