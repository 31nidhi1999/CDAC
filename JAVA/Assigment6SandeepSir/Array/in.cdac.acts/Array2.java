import java.util.Scanner;

public class Array2 {
	
	int [] arr;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Array2(int a) {
		this.arr = new int[a];
	}
	
	public void acceptRecord() {
		System.out.println("Enter the input :");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	
	}
	
	public void printRecord () {
		System.out.println("Print  :");
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		Array2 arr = new Array2(5);
		arr.acceptRecord();
		arr.printRecord();
		
		

	}

}
