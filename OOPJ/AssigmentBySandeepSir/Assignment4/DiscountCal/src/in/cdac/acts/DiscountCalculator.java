package in.cdac.acts;

public class DiscountCalculator {

	private float discountAmount;
	private float discountRate;
	private float originalPrice;
	private float finalprice;
	
	
	//consructor
	public DiscountCalculator() {
		this(0.0f,0.0f,0.0f);
	}
	
	public DiscountCalculator(float a, float b, float c) {
		this.discountAmount=a;
		this.discountRate=b;
		this.originalPrice=c;
	}
	
	
	
	public float getDiscountAmount() {
		return calculateDiscount();
	}
	
	public float getDiscountRate() {
		return discountRate;
	}
	
	public float getOriginalPrice() {
		return originalPrice;
	}


	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
		
	}

	
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	double getFinalPrice() {
		return finalPriceCal();
	}
	
	
	
	//**business logic
	float calculateDiscount() {
		discountAmount = getOriginalPrice() * (getDiscountRate() / 100);
		return discountAmount;
	}
	
	double finalPriceCal() {
		return (getOriginalPrice() - getDiscountAmount());
		 
	}
	
	
	
	
	
	

}
