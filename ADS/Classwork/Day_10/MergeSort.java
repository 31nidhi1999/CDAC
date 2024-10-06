/**
stable
TC  O(nlogn)
n becaue all the elements are participating while each time (n/2^n == logn)
n*log(n)

SC O(N)
noth sorting interbnal & external
stable technique

*/

class MergeSort{
	
	public static void merger(int[] arr,int low, int mid, int high){
		int left = low;
		int right=mid+1;

		int[] temp=new int[arr.length];
		int i =0;
		
		while(left<=mid && right<=high){
			if(arr[left]<=arr[right]){
				temp[i]=arr[left];
				left++;
			
			}else{
				temp[i]=arr[right];
				right++;

			}
				i++;
		}
		
		while(left<=mid){
			temp[i]=arr[left];
				left++;
				i++;
		}
		
		while(right<=high){
			temp[i]=arr[right];
				right++;
				i++;
		}
		
		for(int j = low ; j<=high;j++){
			arr[j] = temp[j - low];
		}
	}
	
	
	public static void display(int[] arr){
		for(int k = 0; k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void mergerSort(int[] arr,int low, int high){
		
		int mid = low+(high-low)/2;
		if(low>=high){
			return;
		}
		mergerSort(arr,low,mid);
		mergerSort(arr,mid+1,high);
		merger(arr,low,mid,high);
	}
	
	public static void main(String [] args){
		int[] arr = {88,44,22,10,100,1};
		//display(arr);
		mergerSort(arr,0,arr.length-1);
		display(arr);
		
	}
}