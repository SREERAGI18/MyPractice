package recursionAndBackTracking;

public class ReverseString {
	
	static void reverse(String s) {
		
		revU(s, s.length()-1);
	}

	private static void revU(String s, int i) {
		
		if(i<0) return;
		
		System.out.print(s.charAt(i));
		revU(s,i-1);
	}

	public static void main(String[] args) {
		
		reverse("Sree");

	}

}
