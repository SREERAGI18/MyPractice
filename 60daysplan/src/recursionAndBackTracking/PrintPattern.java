package recursionAndBackTracking;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			System.out.print(n+" ");
			print(n, n-5);
			System.out.print(n+" ");
			System.out.println();
		}

	}

	private static void print(int original, int n) {
		
		System.out.print(n+" ");
		if(n == original || n<=0) {
			return;
		}
		
		print(original, n-5);
		System.out.print(n+" ");
	}

}
