/**
LS weill work on sorted & unsorted arrray & will also access element sequencially
O(N)
can be worked on 2D dimenstion

BS only work on sorted array & acess via mid point
O(log n) 

only worked in 1D dimention
*/

import java.util.Scanner;
class BinarySearch{
	
	public static int bSearch(int arr1[],int key, int start, int end){
		int mid = start + (end -start)/2;
		if(arr1[mid]==key){
			return mid;
		}
		if(arr1[mid]>key){
			return bSearch(arr1,key,start,mid-1);
		}else{
			return bSearch(arr1,key,mid+1,end);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {11,22,33,44,55,66,77,88,99};
		int key=sc.nextInt();
		int res = bSearch(arr,key,0,arr.length-1);

		
		if(res==-1){
			System.out.println("Element doesn't present in Array");
		}else{
			System.out.println("Element present in Array");
		}
	}
}