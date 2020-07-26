package mathematical;

public class ReverseInteger {
	
	static int reverse(int A) {
		String s = "";
		int n = Math.abs(A);
		
		while(n != 0) {
			
			s = s+Integer.toString(n%10);
			n /= 10;
		}
		if(A < 0) {
			s = "-"+s;
		}
		if(Long.parseLong(s) < Integer.MIN_VALUE) return 0;
		if(Long.parseLong(s) > Integer.MAX_VALUE) return 0;
		
		n = Integer.parseInt(s);
		
		return n;
    }

	public static void main(String[] args) {
		
		System.out.println(reverse(-1146467285));
//		System.out.println(Integer.MIN_VALUE);
	}

}
