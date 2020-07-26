package divideAndConquer;

public class QuickSort {
	
	static void sort(int [] arr) {
		
		sortU(arr, 0, arr.length-1);
	}

	private static void sortU(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int m = partition(arr, start, end);
			
			sortU(arr, start, m-1);
			sortU(arr, m+1, end);
			
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		
		int i = 0;
		int pivot = arr[end];
		
		for(int j=0; j<end; j++) {
			if(arr[j] < pivot) i++;
			else {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i];
		arr[i] = pivot;
		arr[end] = temp;
		
		return i;
	}

	public static void main(String[] args) {
		
		int [] a = {-2,0};
		
		sort(a);
		
		for(int b:a) {
			System.out.print(b+" ");
		}
	}

}
