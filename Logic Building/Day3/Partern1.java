/*
* 
 ** 
 *** 
 ***** 
 ******* 
 ********* 

*/
class Partern1 { 
	public static void main(String[] args) { 
	    int row = 6,count = 1;
		int i = 1;
		while(count<=row){
			if(i%2==0 && i!=2){
				i++;
				continue;
			}else{
				for(int j = 1;j<=i;j++){
					System.out.print("*");
					
				}
				i++;
				count++;
				System.out.println();
			}
			if(count>row){
				break;
			}
		}
		
	} 
} 


/*
 count i j o/p
 0     1 1  *
 1     2 1  *
 1   



*/