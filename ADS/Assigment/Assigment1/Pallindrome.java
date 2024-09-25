/**Negative number can't be a pallindrome*/

import java.util.Scanner;

class Pallindrome{
	
	static int  sum;
	
	static int isPallindrome(int n){
		
		// checking if the number is zero or negative number 
		if(n<=0){
			System.out.println(sum);
			return sum;
		}
		
		sum = sum*10 + (n%10);
		return isPallindrome(n/10);
	}
	
	public static void main(String[] args){
		
		Scanner sc  =  new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num!=isPallindrome(num)){
			System.out.println("false");
		
		}else{
			System.out.println("true");
		}
			
	}
}