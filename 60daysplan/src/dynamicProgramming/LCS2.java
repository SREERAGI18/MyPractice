package dynamicProgramming;
import java.util.*;

	public class LCS2 {

	private static int lcs2(int[] A, int[] B) {
		int[][] dp = new int[A.length+1][B.length+1];
        
        for(int i=0;i<=A.length;i++){
            for(int j=0;j<=B.length;j++){
                if(i==0||j==0){dp[i][j]=0;continue;}
                if(A[i-1] == B[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],Math.max(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        
        return dp[A.length][B.length];
    }
    
    static int solve(String A, String B) {
		
		int[][] dp = new int[A.length()+1][B.length()+1];
        
        for(int i=0;i<=A.length();i++){
            for(int j=0;j<=B.length();j++){
                if(i==0||j==0){dp[i][j]=0;continue;}
                if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],Math.max(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        
        return dp[A.length()][B.length()];
		
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}