package mathematical;
import java.util.*;

public class CollumnNumber {
	
	static int titleToNumber(String A) {
		
//		ArrayList<String> table = new ArrayList<>();
//		for(int i='A'; i<='Z'+1; i++) {
//			table.add(String.valueOf((char) (i-1)));
//		}
//		table.add("Z");
		
		int c = 0;
		
		for(int i=0; i<A.length(); i++) {
			c += (A.charAt(i)-'A'+1)*(Math.pow(26, A.length()-i-1));
		}
		
		return c;
    }

	public static void main(String[] args) {
		
//		String s = "1";
//		
//		System.out.println(Integer.parseInt(s) * 2);
		
		System.out.println(titleToNumber("28"));

	}

}
