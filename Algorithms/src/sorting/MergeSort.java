package sorting;

public class MergeSort {
	
	static void sort(int [] arr) {
			int n = arr.length;
			if(n<2) return;
			
			int m = n/2;
			
			int [] L = new int[m];
			int [] R = new int[n-m];
			
			for(int i=0; i<m; i++) {
				L[i] = arr[i];
			}
			for(int i=0; i<n-m; i++) {
				R[i] = arr[m+i];
			}
			
			sort(L);
			sort(R);
			
			merge(arr,L,R);
	}

	private static void merge(int[] arr, int [] L, int [] R) {
		
		int n1 = L.length;
		int n2 = R.length;
		
		int i =0;
		int j =0;
		int k =0;
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {5,0,-1,9};
		
		sort(arr);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
