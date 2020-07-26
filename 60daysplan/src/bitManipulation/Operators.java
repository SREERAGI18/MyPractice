package bitManipulation;

public class Operators {
	

	public static void main(String[] args) {
		
		int a = 12;
		int b = 23;
		
		
		System.out.println(a&b);
		
		// XOR, O/Ps '1' when bits of a & b are different
		
		System.out.println(a^b);
		
		// NOT, inverts the bits
		
		System.out.println(~a + " "+ ~b);
		
		// Right Shifter, A >> x is equal to division by pow(2, x). Think why.
		
		System.out.println(a>>2);
		
		// Left Shifter, A << x is equal to multiplication by pow(2, x). Think why.
		
		System.out.println(2<<2);
		
		
	}

}