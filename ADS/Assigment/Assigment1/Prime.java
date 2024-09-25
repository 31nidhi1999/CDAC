class Prime{
	
	static int  count;
	static Boolean isPrime(int n,int i){
		
		if(n==2) {
					
			return (n==2)?true:false;
		}
			
		if(n%i==0){
			return false;
		}
		
		
		return isPrime(n,++i);
	}
	
	public static void main(String[] args){
		System.out.println(isPrime(29,2));
		System.out.println(isPrime(2,2));
		System.out.println(isPrime(4,2));
		System.out.println(isPrime(15,2));
	}
	
}