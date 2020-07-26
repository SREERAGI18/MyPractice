package array;
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
	
	static long getMaxPairwiseProduct(int [] arr){
		
		long max =0;
		long secMax =0;
		if(arr[0]>arr[1]) {
			max = arr[0];
			secMax = arr[1];
		}else {
			max = arr[1];
			secMax = arr[0];
		}
		for(int i=2; i<arr.length; i++){
			if(arr[i] > max){
				secMax = max;
				max = arr[i];
				continue;
			}
			if(arr[i] > secMax) {
				secMax = arr[i];
			}
		}
		return (secMax*max);
	}

	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int n = scanner.nextInt();
        	int[] numbers = new int[n];
        	
		for (int i = 0; i < n; i++) {
            		numbers[i] = scanner.nextInt();
        	}
        System.out.println(getMaxPairwiseProduct(numbers));
    	}
}