package assigment2;

public class HollowRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i|| i==row) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
