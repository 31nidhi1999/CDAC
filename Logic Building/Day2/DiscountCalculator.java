class DiscountCalculator{
	public static void main(String[] args){
		int totalPurchase=400;
		int disccount;
		String membershipCard ="Yes";
		
		if(totalPurchase >=1000){
			if(membershipCard.equals("Yes")){
				disccount = totalPurchase*75/100;
				System.out.println("Total purchase after discount " + disccount);
			}
			if(membershipCard.equals("No")){
				disccount = totalPurchase*80/100;
				System.out.println("Total purchase after discount " + disccount);
			}
		}else if(totalPurchase >=500 && totalPurchase<=999){
			if(membershipCard.equals("Yes")){
				disccount = totalPurchase*85/100;
				System.out.println("Total purchase after discount " + disccount);
			}
			if(membershipCard.equals("No")){
				disccount = totalPurchase*90/100;
				System.out.println("Total purchase after discount " + disccount);
			}
		}
		else{
			if(membershipCard.equals("Yes")){
				disccount = totalPurchase*90/100;
				System.out.println("Total purchase after discount " + disccount);
			}
			if(membershipCard.equals("No")){
				disccount = totalPurchase*95/100;
				System.out.println("Total purchase after discount " + disccount);
			}
		}
	}
}