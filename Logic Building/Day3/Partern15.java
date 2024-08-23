/*
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1 

*/

class Partern15{
	public static void main(String args[]){
		int row  =5;
		for(int i = 1; i <=row;i++){
			for(int j = 1; j <=2*i -1 ;j++){
				if(j%2==0){
					System.out.print("*");
				}else{
					System.out.print(i);
				}
			}
			System.out.println("");
			
		}
		for(int i =row; i>=1;i--){
				for(int j =1; j<=2*i - 1 ;j++){
					if(j%2==0){
						System.out.print("*");
					}else{
						System.out.print(i);
					}
				}
				System.out.println("");
			}
	}
}