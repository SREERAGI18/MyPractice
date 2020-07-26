package string;

public class ImmutableString {

	public static void main(String[] args) {
		
		String s1 = "Sree"; // s1 will point to the address of the object 
		// in the String pool for example 101
		
		String s2 = "Sree"; // Here, as same String is called , s2 will point to 
		// the same Object pointed by s1 i.e. s2 will point to 101 instead of
		// creating a new Object
		
		s2 = "Ragi"; // new Object is creating for String Ragi and 
		// address is stored in s2

	}

}
