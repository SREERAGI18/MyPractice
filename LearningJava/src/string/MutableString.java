package string;

public class MutableString {

	public static void main(String[] args) {
		
		// making String mutable using StringBuffer or StringBuilder class
		
		// StringBuffer
		
		String s1 = "Sree";
		
		StringBuffer sb = new StringBuffer(s1);
		// address of the object of s1 is stored in sb
		
		sb.append("Ragi"); // new String Ragi is added to the same Object of s1
		
		System.out.println(sb);
		
		//StringBuilder :- it is same as the StringBuffer class, 
		// the only difference is that StringBuffer is Thread-safe.
		
	}

}
