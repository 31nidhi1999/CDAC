import java.lang.Math;


class Armstrong {

	static double  sum ;
	static int temp;
	
	static String isArmstrong(int n){
	
		if (n>0) {
			int rem = n % 10;
			sum = Math.pow(rem,3)  + sum;
			isArmstrong(n/10);
		}
		
		if(temp==sum)
			return (temp +" is  an Armstrong Number");
		return (temp +" is not an Armstrong Number");

	}
	
	public static void main(String[] args){
		
		temp = 153;
		System.out.println(isArmstrong(temp));
		
	}


}