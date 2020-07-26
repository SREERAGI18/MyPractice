package sorting;

import java.util.Random;

public class Quick {
	
	static void sortAlgo(int [] arr, int start, int end) {
		if(start < end) {
			int pInd = partition(arr, start, end);
			sortAlgo(arr,start,pInd-1);
			sortAlgo(arr,pInd+1,end);
		}
	}
	
	static void sort(int [] arr) {
		sortAlgo(arr,0,arr.length-1);
	}

	private static int partition(int[] arr, int start, int end) {
		Random rand = new Random();
		int gen = rand.nextInt(end-start+1) + start;
		int t = arr[gen];
		arr[gen] = arr[end];
		arr[end] = t;
		
		int pivot = arr[end];
		int pInd = start;
		int temp =0;
		
		for(int i=start; i<end; i++) {
			if(arr[i] <= pivot) {
				temp = arr[i];
				arr[i] = arr[pInd];
				arr[pInd] = temp;
				
				pInd++;
			}
		}
		temp = arr[end];
		arr[end] = arr[pInd];
		arr[pInd] = temp;
		
		return pInd;
	}

	public static void main(String[] args) {
		
		int [] arr = {2,1,5,8,10,4};
		
		sort(arr);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}

	}

}
