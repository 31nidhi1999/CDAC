package org.example.domain;

public class Program {
	public  static void  main(String[] args) {
		SeatingMangmentUttil smu = new SeatingMangmentUttil();
		MenuEnum chooice;
		
		while((chooice=SeatingMangmentUttil.menuList())!=MenuEnum.EXIT) {
			switch (chooice) {
			case BOOK_SEAT:
				smu.bookTicket();
				break;
			case CANVEL_BOOKING:
				smu.CancelBooking();
				break;
			case SEAT_AVAILBILITY:
				smu.seatAvavibility();
				break;
			case DISPLAY_CHAR:
				smu.chart();
				break;
			case EXIT:
				break;
			}
			
		}

		

	}

}
