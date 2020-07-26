package sorting;

public class Insertion {
	
	static void insertionSort(int [] arr, int n) {
		if(n == 1) return;
		insertionSort(arr, n-1);
		
		int temp = arr[n-1];
		int pivot = (n-2);
		
		while(pivot != -1) {
			if(temp < arr[pivot]) {
				arr[pivot+1] = arr[pivot];
				pivot--;
			}else break;
		}
		arr[pivot+1] = temp;
		
	}

	public static void main(String[] args) {
		
		int [] arr = {24,36,11,19,100};
		
		insertionSort(arr,5);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
