package recursionAndBackTracking;

public class Pow {
	
	static int pow(int a, int b) {
		
		if(b == 0) return 1;
		if(b == 1) return a;
		
		return a * pow(a, b-1);
	}

	public static void main(String[] args) {
		
		System.out.println(pow(2, 0));

	}

}
