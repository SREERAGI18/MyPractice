package recursion;
import java.util.*;

public class Fibonacci {
	
	static int print(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return print(n-1) + print(n-2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			System.out.print(print(i) + " ");
		}
	}

}
