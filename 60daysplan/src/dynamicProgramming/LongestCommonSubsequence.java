package dynamicProgramming;

public class LongestCommonSubsequence {
	
	static int solve(String A) {
		
		String B = reverse(A);
		
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
        
        for(int i=0; i<=A.length(); i++) {
			for(int j=0; j<=B.length(); j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
        
        return dp[A.length()][B.length()];
		
    }

	private static String reverse(String a) {
		char c [] = a.toCharArray();
		
		String s = "";
		
		for(int i=c.length-1; i>=0; i--) {
			s += c[i];
		}
		return s;
	}

	public static void main(String[] args) {
		
		String A = "bebeeed";
		
		
		System.out.println(solve(A));

	}

}
