/*

5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1 
*/

class Partern9 { 
	public static void main(String[] args) { 
		int rowAdd = 0;
		 
		for(int i =1; i<=5;i++){
			
			int num =5;
			
			for(int j =1; j<=i + rowAdd;j++){
				
				
				if(j%2 == 0){
					System.out.print("*");
				}else{
					System.out.print(num);
					num --;
				}
				
			    	
			}
			
			rowAdd++;
			System.out.println("");
		}
	} 
}


/*
i j  rowAdd j=<i+1 num o/print
1 1  0      0<=0   	5   5

2 1  1      1<=3    5   5
2 2  1      2<=3    4   *
2 3  1      2==3    4   4

*/ 