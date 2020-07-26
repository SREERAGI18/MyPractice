package week4;

import java.util.*;

public class Inversions {
	
    private static long getNumberOfInversions(int[] a) {
    	
    	long numberOfInversions = 0;
    	
        int n = a.length;
        
        if (n<2) {
            return numberOfInversions;
        }
        int m = n / 2;
        
        int [] l = new int[m];
        int [] r = new int[n-m];
        
        for(int i=0; i<m; i++) {
        	l[i] = a[i];
        }
        for(int i=0; i<n-m; i++) {
        	r[i] = a[i+m];
        }
        
        numberOfInversions = getNumberOfInversions(l)+ getNumberOfInversions(r);
        
        numberOfInversions += merge(a,l,r);
        
        return numberOfInversions;
    }
    
	private static long merge(int[] a, int[] l, int[] r) {
		
		long numberOfInversions = 0;
		
		int i=l.length-1;
		int j=r.length-1;
		int k=a.length-1;
		
		
		while(i>=0 && j>=0) {
			int right = j;
			
			while(right>=0) {
				if(l[i] > r[right]) {
					numberOfInversions++;
					right--;
				}else {
					a[k] = r[j];
					j--;
					break;
				}
				a[k] = l[i];
			}
			if(right == -1) i--;
			k--;
		}
		
		while(i>=0) {
				
				a[k] = l[i];
				i--;
				k--;
		}
		
		while(j>=0) {		
		
				a[k] = r[j];
				j--;
				k--;
		}
		
		return numberOfInversions;
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int [] l = {2,3,9};
        int r [] = {2,9};
        
        System.out.println(getNumberOfInversions(a));
        
//        System.out.println(merge(a,l,r));
        
//        for(int e: a) {
//        	System.out.print(e+" ");
//        }
    }
}