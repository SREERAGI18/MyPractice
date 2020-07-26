package recursionAndBackTracking;

public class SubSequences {
	
	static void seq(String s) {
		seqU(s, 0, s.length());
	}

	private static void seqU(String s, int start, int end) {
		
		if(start == end) return;
		
		System.out.print(s.substring(start, end)+" ");
		
		start++;
		seqU(s,start,end);
		
		start = 0;
		end--;
		seqU(s,start,end);
		
	}

	public static void main(String[] args) {
		
		seq("abc");

	}

}
