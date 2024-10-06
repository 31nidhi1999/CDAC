package QuickSort;

public class QuickSort {

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low + 1;
		int j = high;
		int temp;
		while (i <= j) {

			while (i <= high && arr[i] <= pivot) {
				i++;
			}

			while (j >= low && arr[j] > pivot) {
				j--;
			}

			if (i < j) {
				temp = arr[i]; // i and j not crossed then swap the elements
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[low]; // swap the pivot element with j
		arr[low] = arr[j];
		arr[j] = temp;

		return j; // return position of pivot
	}

	public static void Quick(int arr[], int low, int high) {

		if (low < high) {
			int partionIndex = partition(arr, low, high);
			Quick(arr, low, partionIndex - 1); //Recursively sort left 
			Quick(arr, partionIndex + 1, high); //Recursively sort  right 
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		int n = arr.length;
		Quick(arr, 0, n - 1);

		System.out.println("Sorted array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}