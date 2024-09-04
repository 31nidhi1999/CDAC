package assigment2;

public class PallindromPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			int w = i -1;
			for(int k =1;k<=2*i-1;k++) {
				
				if(k<=5) {
					System.out.print(k);
				}else {
					System.out.print(w);
					w--;
					
				}
			}
			System.out.println("");
		}

	}

}
