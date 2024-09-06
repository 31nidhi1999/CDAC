package in.cdac.acts;

public class DiscountCalculator {
	
	float discountAmount,discountRate;
	float originalPrice;
	float finalPrice;
	
	void acceptRecord(float price, float discount) {
		originalPrice=price;
		discountRate=discount;
	}
	
	double calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		return discountAmount;
	}
	
	double finalPriceCal() {
		finalPrice = originalPrice - discountAmount;
		return finalPrice;
	}

	void printRecord() {
		System.out.println("DiscountAmount :"+calculateDiscount());
		System.out.println("FinalPrice :"+finalPriceCal());
	}
}
