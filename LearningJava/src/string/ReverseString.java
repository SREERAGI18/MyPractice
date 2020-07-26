package string;

import java.util.Stack;

public class ReverseString {
	
	static String reverse(String s) {
		
		String reversed = "";
		
		
		for(int i=s.length()-1; i>=0; i--) {
			reversed = reversed+s.charAt(i);
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		
		String s = "Sree";
		StringBuffer sb = new StringBuffer(s);
		
//		System.out.println(reverse(s));
		System.out.println(sb.reverse().toString()); // using StringBuffer class

	}

}
