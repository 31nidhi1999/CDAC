/*
* 
 ** 
 *** 
 ***** 
 ******* 
 *********

*/

class Partern11{
	public static void main(String[] args){
		int num =0;
		
	   for(int i = 1; i <=6;i++){
		   for(int j = 1; j<=i +num;j++){
			   if(j%2==0 && j!=2){
				  num++;
			   }else{
				   System.out.print("*");
			   }
		   }
		   System.out.println("");
	   }
		
	}
}