package in.cdac.domain;

public class Address {
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		this("xyz","abc","ghj");
	}
	
	public Address(String a, String b,String c) {
		this.city=a;
		this.state=b;
		this.pincode=c;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.city+" "+this.state+" "+this.pincode;
	}
}
