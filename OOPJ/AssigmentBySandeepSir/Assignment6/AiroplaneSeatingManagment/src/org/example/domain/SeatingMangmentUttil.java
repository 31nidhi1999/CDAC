package org.example.domain;

import java.util.Scanner;

public class SeatingMangmentUttil {
	
	private static Scanner sc=new Scanner(System.in);
	SeatingManagment sm = SeatingManagment.getInstane();
	
	
	
	public void bookTicket() {
		System.out.println("Enter the seat number row wise to book ticket:");
		int a = sc.nextInt();
		
		System.out.println("Enter the seat number column wise  to book ticket:");
		int b = sc.nextInt();
		
		sm.bookingseat(a, b);
		
	}
	
	public void CancelBooking() {
		System.out.println("Enter the seat number row wise to cancel ticket :");
		int a = sc.nextInt();
		
		System.out.println("Enter the seat number column wise to cancel ticket :");
		int b = sc.nextInt();
		
		sm.cancelbooing(a, b);
	}
	
	public void seatAvavibility() {
		int seat = sm.seatAvailabilty();
		System.out.println(seat);
	}
	
	public void chart() {
		sm.displayCharty();
	}
	
	

	/*BOOK_SEAT, CANVEL_BOOKING, SEAT_AVAILBILITY,DISPLAY_CHAR
*/
	public static MenuEnum menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.BOOK_SEAT");
		System.out.println("2.CANVEL_BOOKING");
		System.out.println("3.SEAT_AVAILBILITY");
		System.out.println("4.DISPLAY_CHAR");
		System.out.println("Enter a number :");
		return MenuEnum.values()[sc.nextInt()];
	}

}
