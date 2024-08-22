class Factorial{
	public static void main(String[] agrs){
		int i = 10;
		int factorial=1;
		for(;i >0;i--){
			factorial *= i;
		}
		
		System.out.println("Factorial of 10 is  ::" + factorial);
	}
}