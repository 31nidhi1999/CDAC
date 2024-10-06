/**
repeated find the min elements from the unsoretd part & swaps it with first unsoretd elemets

TC BEST :: O(n^2) 
TC  AVG:: O(n^2) 
TC WORST :: O(n^2) 
*/
class SelectionSort{

	public static void sSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			int min = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
			display(arr);
			System.out.println();
			
		}
		//display(arr);
	}
	
	public static void display(int[] arr){
		for(int k = 0; k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = {44,88,99,10,100,1};
		display(arr);
		System.out.println();
		sSort(arr);
	}
}