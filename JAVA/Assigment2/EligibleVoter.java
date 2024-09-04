package assigment2;

import java.util.Scanner;

public class EligibleVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 int age = sc.nextInt();
		 
		 if(age<18) {
			 System.out.println("Not eleigible for voting");
		 }else {
			 System.out.println("Eligible for voting");
		 }

	}

}
