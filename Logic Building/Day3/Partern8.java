/*
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9
*/

class Partern8 { 
	public static void main(String[] args) { 
		int num = 0;
		 
		for(int i =1; i<=5;i++){
			
			for(int j =1; j<=i + num;j++){
				
				if(j%2 == 0){
					System.out.print("*");
				}else{
					System.out.print(j);
				}
			    	
			}
			
			num++;
			System.out.println("");
		}
	} 
} 


/*
i j o/p num
1 1 1   0 

2 1 1   2 + 1
2 2 *   
2 3 3

3 1 1   3 + 2
3 2 *
3 3 3
3 4 *
3 5 5






*/