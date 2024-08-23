/*
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5
*/

class Partern10 { 
	public static void main(String[] args) { 
		int rowAdd = 0;
		 
		for(int i =1; i<=5;i++){
			
			int num =1;
			
			for(int j =1; j<=i + rowAdd;j++){
				
				
				if(j%2 == 0){
					System.out.print("*");
				}else{
					System.out.print(num);
					num ++;
				}
				
			    	
			}
			
			rowAdd++;
			System.out.println("");
		}
	} 
}