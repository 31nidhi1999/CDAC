import java.util.Scanner;
class RemoveWhiteSpaces{
	
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		
		for(int i =0; i<strArr.length;i++){      //n+1
			System.out.print(strArr[i]+"");		//n	
		}
		
	}
}
/*
n + 1+ n
2n+1
O(n)
Linear time complexity
*/

/*
sc = 1
str = 1
strArr = n
i = 1
O(n)
Linear space complexity
*/