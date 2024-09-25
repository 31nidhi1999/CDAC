class Prime{
	
	static int i=2;
	static int  count;
	static String isPrime(int n){
		
		if(n%i==0 && i<n){
			count++;
			i++;
			isPrime(n);
		}
		
		if(count == 0)
			return (n +" is a prime number");
		return (n +" is not a prime number");
		
	}
	
	public static void main(String[] args){
		System.out.println(isPrime(7));
		System.out.println(isPrime(10));
	}
	
}