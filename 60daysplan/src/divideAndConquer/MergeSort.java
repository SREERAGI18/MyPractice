package divideAndConquer;

public class MergeSort {
	
	static void sort(int [] arr) {
		
		if(arr.length>1) {
			int n = arr.length;
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
	}

	private static void merge(int[] arr, int[] l, int[] r) {
		
		int i=0;
		int j=0;
		int k=0;
		
		int n1 = l.length;
		int n2 = r.length;
		
		while(i<n1 && j<n2) {
			if(l[i] < r[j]) {
				arr[k] = l[i];
				i++;
			}else {
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		
		while(j<n1) {
			arr[k] = r[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		
		int [] a = {5,0,-1,9};
		
		sort(a);
		
		for(int n: a) {
			System.out.print(n+" ");
		}

	}

}
