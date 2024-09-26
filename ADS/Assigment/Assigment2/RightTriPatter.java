import java.util.Scanner;
class RightTriPatter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();						//Outter   //inner
		for(int i = 1; i<=n; i++){  				//n+1

			for(int j =1 ; j<=i;j++){				//n			n+1
				System.out.print("*");				//n			n
			}
			
			System.out.println();
		}
	}
}

/*

n+1 + n(n+1) + n*n
n + 1 + n^2 + n + n^2;
2n^2 + 2n + 1

O(n^2)

*/