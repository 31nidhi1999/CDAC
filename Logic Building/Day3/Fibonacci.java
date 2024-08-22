class Fibonacci{
	public static void main(String[] agrs){
		int n1 = 0,n2=1;
		int sum = 0;
		System.out.println("Fibonacci sequence up to 0 " + n1);
		System.out.println("Fibonacci sequence up to 1 " + n2);
		for(int i =2 ;i < 22;i++){
			sum = n1 + n2;
			System.out.println("Fibonacci sequence up to "+i+ " "+ sum);
			n1=n2;
			n2=sum;
		}
		
		
	}
}