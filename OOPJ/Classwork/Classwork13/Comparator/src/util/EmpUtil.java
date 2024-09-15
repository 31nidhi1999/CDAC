package util;

import java.util.Arrays;
import java.util.Scanner;

import employee.Employee;

public class EmpUtil {
	static Scanner sc = new Scanner(System.in);
	
	
	public static SORTBY menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.SORT_BY_NAME");
		System.out.println("2.SORT_BY_ID");
		System.out.println("3.SORT_BY_SALARY");
		System.out.println("Enter a Number :");
		
		return SORTBY.values()[sc.nextInt()];
	}

}
