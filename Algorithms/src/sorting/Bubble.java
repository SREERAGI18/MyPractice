package sorting;

public class Bubble {
	
	static void sort(int [] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int temp = 0;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int arr [] = {1,10,6,0,19};
		
		sort(arr);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}

	}

}
