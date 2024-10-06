/**
noo need to compare sorted arrat becase whil condition takinh care condition
TC BESTL 0(1);
tc avg O(n/^2)
tc Worst O(n/^2)

stable sorting tecnique
Interal sorted


*/


class InsertionSort{
	
	public static void iSort(int[] arr){
		for (int i = 1;i<arr.length;i++){
			int key = arr[i];
			int j=i-1;
			while(j>=0 &&  arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			display(arr);
			System.out.println();
		}
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
		iSort(arr);
	}
}