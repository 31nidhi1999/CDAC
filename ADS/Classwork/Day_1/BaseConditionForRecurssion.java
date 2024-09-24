public class BaseConditionForRecurssion{
	
	//recurssive method
	static void checkBaseCondition(int n){
		
		//base or terminal condition
		if(n>=1){		
			System.out.println(n);
			checkBaseCondition(n -1);
		}
		
	}
	
	public static void main(String[] args){
	
		//calling method
		checkBaseCondition(10);
	
	}
}