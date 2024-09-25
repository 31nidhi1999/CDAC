class FactorialCalculator{
	
	static int fact(int n){
		
		if(n<=1)
			return n;
		return n * fact(n-1);
		
	}
	
}

class Factorial{
	public static void main(String[] args){
		
		System.out.println(FactorialCalculator.fact(10));
		
	}
}