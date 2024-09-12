package assigment2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int year =  sc.nextInt();
		char c;

		if(year % 400 ==0 ||(year %4 == 0 && year %100 !=0)) {
			c ='a';
		}else {
			c ='b';
		}

		switch (c) {
		case 'a':
			System.out.println(year +  " is a Leap Year");
			break;
		case 'b':
			System.out.println(year + " is Not a Leap Year");
		}


	}

}
