package recursionAndBackTracking;
import java.util.Scanner;

public class ShuffleInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int j=0; j<n; j++) {
				arr[j] = sc.nextInt();
			}
			
			shuffle(arr, n/2, n-1);
		}

	}

	private static void shuffle(int[] arr, int i, int j) {
		
		if(i<=0) return;
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
		shuffle(arr, i--, j--);
	}

}
