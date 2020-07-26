package regEx;

import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {

		boolean b = Pattern.matches("..m", "am");
		System.out.println(b);
		
		String s = "Julia_21";
		s.matches("");
	}

}
