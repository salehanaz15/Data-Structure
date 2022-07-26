public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		System.out.println("Sorted array is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot element is the last element in the array
        int i = low - 1; // index of smaller element 
        for (int j = low; j < high; j++) { 
            if (arr[j] <= pivot) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
   return i+1;