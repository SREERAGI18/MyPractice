package week4;

import java.util.*;
import java.io.*;

public class MajorityElement {
	static int count = 0;
	static int major = 0;
    private static int getMajorityElement(int[] a) {
    	
    	int n = a.length;
    	
        if (n < 2) {
            return -1;
        }
        int m = n/2;
        
        int [] l = new int[m];
        int [] r = new int[n-m];
        
        getMajorityElement(l);
        getMajorityElement(r);
        
        merge(a,l,r);
//        if (left + 1 == right) {
//            return a[left];
//        }
        return -1;
    }

    private static void merge(int[] a, int[] l, int[] r) {
		
    	int n1 = l.length;
    	int n2 = r.length;
    	
    	
		
	}

	public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
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