import java.util.Scanner;
class ReverseArrayInPlace{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i =0;i < size;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("[");
		for(int j =size - 1 ;j>=0;j--){
			
			if(j==0){
				System.out.print(arr[j]);
			}else{
				System.out.print(arr[j]+",");
			}
		}
		System.out.print("]");
	}
}

/**

TC O(n)
Sc o(n)
*/