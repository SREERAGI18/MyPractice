package week4;

import java.io.*;
import java.util.*;

public class Sorting {
    private static Random random = new Random();

    private static int[] partition3(int[] a, int l, int r) {
      
    	int i = l+1;
    	int pivot = a[l];
    	
    	while(l<=r && i <= r) {
    		if(a[i] < pivot) {
    			int temp = a[l];
    			a[l] = a[i];
    			a[i] = temp;
    			l = i;
    			i++;
    			
    		}else if(a[i] > pivot) {
    			
    			while(a[i] < a[r]) r--;
    			int temp = a[r];
    			a[r] = a[i];
    			a[i] = temp;
//    			i++;
    			r--;
    		}else i++;
    	}
      int m1 = l;
      int m2 = r;
      
      int[] m = {m1, m2};
      return m;
    }
    
    private static void randomizedQuickSort(int[] a, int l, int r) {
        if (l < r) {
          int k = random.nextInt(r - l) + l;
            
            int t = a[l];
            a[l] = a[k];
            a[k] = t;
            
//            int m = partition2(a, l, r);
            int [] m = partition3(a,l,r);
            System.out.print(m[0] +" "+m[1]+" ");
            System.out.println();
            randomizedQuickSort(a, l, m[0] - 1);
            randomizedQuickSort(a, m[1] + 1, r);
        }

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}