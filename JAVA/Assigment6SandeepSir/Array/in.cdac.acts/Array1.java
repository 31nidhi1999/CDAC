import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		int[] array = new int[5];
		
		System.out.println("Print default Array :");
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Enter the input :");
		for(int i =0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Print  :");
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
