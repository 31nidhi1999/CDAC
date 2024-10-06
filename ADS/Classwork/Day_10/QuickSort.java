 class QuickSort{
	 
	public static int partition(int[] arr, int low,int high){
		int pivort = arr[low];
		int  i = low  + 1;
		int  j = high;
		
		while(i<j){
			while(arr[i]<=pivort && i<high-1){
				i++;
			}
			
			while(arr[j]>pivort && j>=low){
				j--;
			}
			if(i<j){
				swap(arr,i,j);
			}
		}
		
		
		
		swap(arr,low,j);
	     return j;
		
	}
	
	public static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void display(int[] arr){
		for(int k = 0; k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	 
	public static void quickSort(int[] arr,int low,int high){
		if(low>=high){
			return;
		}
		
		int pivort = partition(arr,low,high);
		quickSort(arr,low,pivort-1);
		quickSort(arr,pivort+1,low);
	}
	 
	public static void main(String [] args){
		int[] arr = {64, 25, 12, 22, 11};
		//display(arr);
		quickSort(arr,0,arr.length-1);
		display(arr);
		
	}
 }