package in.cdac.domain;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this(0,0,0);
	}
	
	public Date(int a, int b, int c ) {
		this.day=a;
		this.month=b;
		this.year=c;
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day+"/"+this.month+"/"+this.year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
