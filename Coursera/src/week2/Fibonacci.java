package week2;
import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
    private static long getFibonacciLastDigitNaive(long n) {
        if (n <= 1)
            return n;

        ArrayList<Long> list = new ArrayList<>();
		
        BigInteger c = BigInteger.valueOf(5);
        BigInteger val = BigInteger.valueOf(n);
		BigInteger prev = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		BigInteger nth = BigInteger.ONE;
		
		list.add(prev.mod(c).longValue());
		
		for(int i=0; i<2000; i++) {
				
			temp = nth;
			nth = nth.add(prev);
			prev = temp;
			
			if(prev.mod(c).equals(BigInteger.ZERO) && nth.mod(c).equals(BigInteger.ONE)) break;
			
			list.add(prev.mod(c).longValue());
		}
		BigInteger size = BigInteger.valueOf(list.size());
		int res = val.mod(size).intValue();

        return list.get(res);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

