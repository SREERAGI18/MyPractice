package sorting;

public class Selection {
	
	static void sort(int [] arr) {
		int n  = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int Min = i;
			for(int j=i; j<n; j++) {
				if(arr[j] < arr[Min]) {
					Min = j;
				}
				int temp = arr[Min];
				arr[Min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {10,11,9,2,0};
		
		sort(arr);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}

	}

}
