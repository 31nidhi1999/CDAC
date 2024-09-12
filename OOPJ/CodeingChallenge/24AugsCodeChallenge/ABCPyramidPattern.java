package assigment2;

public class ABCPyramidPattern {

	public static void main(String[] args) {
		int num = 65;
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			for(int j =1; j<=5 - i; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=2*i -1;k++) {
				System.out.print((char)num);
				num++;
			}
			System.out.println("");
		}

	}

}
