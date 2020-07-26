package week3;

import java.util.Scanner;

public class FractionalKnapsack {
	
	static void insertionSort(int [] weights, double [] perUnit, int n) {
		
		for(int i=0; i<n; i++) {
			double tmp = perUnit[i];
			int tmp2 = 0;
			for(int j=i; j<n; j++) {
				
				if(perUnit[j] > tmp) {
					tmp = perUnit[j];
					perUnit[j] = perUnit[i];
					perUnit[i] = tmp;
					
					tmp2 = weights[j];
					weights[j] = weights[i];
					weights[i] = tmp2;
				}
			}
		}
	}
	
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double [] perUnit = new double[values.length];
        
        for(int i=0; i<values.length; i++) {
        	perUnit[i] = (double) values[i]/weights[i];
        }
        insertionSort(weights,perUnit,perUnit.length);
        	double temp =0;
        	
        	for(int i=0; i<values.length; i++) {
        		temp = weights[i];
        		if(temp > capacity) {
        			temp = capacity;
        		}
        		value = value + (temp*perUnit[i]);
        		capacity -= temp;
        	}
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 

