class BubbleSort{
	
	static void bSort(int[] arr){
		int n = arr.length;
		boolean flag;
		
		for(int i=0;i<n-1;i++){
			int a = 0;
			flag = false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
				   
				    int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				    flag = true;
					//System.out.println("\n"+ ++a);
				}
				
			}
			System.out.println();
			dispay(arr);
			if(flag==false){
				break;
			}
			
		}
		
	}
	
	static void dispay(int[] arrDis){
		
		for(int j =0;j<arrDis.length;j++){
			System.out.print(arrDis[j]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr={55,22,77,44,33,1};
		//dispay(arr);
		bSort(arr);
		
		System.out.println("\nPassing sorted array");
		int[] arr1={1,22,33,44,55,77};
		bSort(arr1);
	}
	
}