package bitManipulation;

public class Couple {

	public static void main(String[] args) {
		
		int or = 0;
		int xor = 0;
		int count = 0;
		int n = 7;
		
		for(int i=0; i<=n; i++) {
			or = n | i;
			xor = n^i;
			if(or == xor) count++;
		}
		
		System.out.println(count);
 
	}

}