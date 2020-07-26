package string;

public class RemoveCharacterFromNumber {

	public static void main(String[] args) {
		
		String s = "987bv68a687";
		
		System.out.println(convert(s));

	}

	private static String convert(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0; i<sb.length(); i++) {
			// ASCII values of 0 to 9 digits is between 48 and 57.
			if(sb.charAt(i) < 48 || sb.charAt(i) > 57) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		return sb.toString();
	}

}
