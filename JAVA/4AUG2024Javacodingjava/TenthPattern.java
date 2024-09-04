package assigment2;

public class TenthPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  row =4;
		int num =1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(i+" ");
				}else {
					System.out.print(j*i +" ");
				}
			}
			System.out.println();
		}
		
		for(int i = row -1;i>0;i--) {
			for(int j = 1;j<=i;j++) {
				if(j==1) {
					System.out.print(row + 1 + " ");
				}else {
					System.out.print((row+1)*j + " ");
					
				}
				
			}
			row++;
			System.out.println();
		}

	}

}
