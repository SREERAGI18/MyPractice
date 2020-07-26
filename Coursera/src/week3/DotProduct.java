package week3;

import java.util.*;

public class DotProduct {
	
	static boolean onlyNegative(int [] arr) {
		boolean neg = true;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				neg = false;
				break;
			}
		}
		
		return neg;
	}
	
	static boolean onlyPositive(int [] arr) {
		boolean pos = true;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				pos = false;
				break;
			}
		}
		
		return pos;
	}
    private static long maxDotProduct(int[] a, int[] b) {
        
    	Arrays.sort(a);
    	Arrays.sort(b);
    	
        long result = 0;
        
//        if(onlyPositive(a)&& onlyNegative(b) || onlyPositive(b) && onlyNegative(a)) {
//    		return a[a.length-1] * b[b.length-1];
//    	
//    	}
        
        for (int i = 0; i < a.length; i++) {
            
            result += a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}