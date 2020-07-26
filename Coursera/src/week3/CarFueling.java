package week3;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
    	
    	if(tank >= dist) return 0;
    	
    	int n = stops.length;
    	
    	int prev = 0; int count = 0; int filled = tank;
    	
    	if(dist-stops[n-1] > tank) return -1;
    	
    	if(filled < stops[0]) return -1;
    	
    	if(n==1) return 1;
    	
    	for(int i=0; i<n-1; i++) {
    		
    		if((stops[i+1] - stops[i]) > tank) return -1;
    		
    		if(filled < stops[i+1]) {
    			filled = stops[i] + tank;
    			count++;
    		}
    	}
    	
    	if(filled < dist) count++;
    	
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}