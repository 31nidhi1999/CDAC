package org.example.domain;

public class SeatingManagment {
	private static int[][] seat;
	private static int  count;
	private static SeatingManagment sm;

	
	/*singleton*/
	public static SeatingManagment getInstane() {
		if(sm==null) {
			
			sm=new SeatingManagment(4, 4);
		}
		return sm;
	}
	
	public SeatingManagment() {
		this(0,0);
	}
	
	public SeatingManagment(int row,int col) {
		count=row*col;
		seat = new int[row][col];
		
	}
	
	public void bookingseat(int a,int b) {
		if(count>0) {
			if(seat[a][b]==0) {
				seat[a][b]=1;
				System.out.println("Ticket booked");
				count--;
			}else {
				System.out.println("The seat to tried to book is occupied kindy book the avavible seat from below display");
				displayCharty();
			}
		}
			
	}
	
	public void cancelbooing(int a,int b){
		if(seat[a][b]==1) {
			seat[a][b]=0;
			System.out.println("booking canclled");
			count++;
		}
	}
	
	public int seatAvailabilty() {

		return count;
	}
	
	public void displayCharty() {
		//int count=0;
		for(int[] row : seat) {
			for(int col : row) {
				System.out.print(col+" ");
				}
			
			System.out.println();
			}
	}

	
	
}
