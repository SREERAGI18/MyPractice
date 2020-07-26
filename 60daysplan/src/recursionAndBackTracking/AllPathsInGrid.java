package recursionAndBackTracking;

public class AllPathsInGrid {
	
	static boolean palindrome(String s) {
		
		return palUtil(s,0,s.length()-1);
	}
	private static boolean palUtil(String s, int i, int j) {
		if(i == j) {
			return true;
		}
		
		if(s.charAt(i) == s.charAt(j)) {
			return true;
		}else return false;
		
	}
	public static void main(String[] args) {
		
		System.out.println(palindrome("malayala"));

	}

}
