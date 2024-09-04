package assigment2;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number =sc.nextInt();
		
		switch(number) {
		case 4:
		case 5:
			System.out.println("Summer");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("Mansoon");
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("Autum");
			break;
			
		case 12:
		case 1:
			System.out.println("Winter");
			break;
			
		case 2:
		case 3:
			System.out.println("Spring");
			break;
			
		default:
			System.out.println("Enter the valid month number");
		}
		
	}

}
