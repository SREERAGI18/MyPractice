package dynamicProgramming;

import java.util.Scanner;

public class Steps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
	        int n = sc.nextInt();
	        long[] dp = new long[n+1];
	        
	        dp[0] = 1;
	        dp[1] = 1;
	        dp[2] = 2;
	        
	        for(int j=3; j<dp.length;j++) {
	            dp[j] = dp[j-1] + dp[j-2]+dp[j-3];
	        }
	        System.out.println(dp[n]);
		}
		sc.close();
	}

}
