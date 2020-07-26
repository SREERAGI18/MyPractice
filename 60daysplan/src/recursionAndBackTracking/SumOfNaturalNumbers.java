package recursionAndBackTracking;

public class SumOfNaturalNumbers {
	
	static int sum(int n) {
		if(n<2) return n;
		
		return sum(n-1)+n;
	}

	public static void main(String[] args) {
		
		System.out.print(sum(0));

	}

}
