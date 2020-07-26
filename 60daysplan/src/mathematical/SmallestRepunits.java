package mathematical;

import java.util.Scanner;

public class SmallestRepunits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			boolean repunit = false;
			int j=1;
			
			while(!repunit) {
				long rep = (long) Math.pow(10, j);
				long div = (rep-1)/9;
				
				
				if(div%n == 0) {
					String s = Long.toString(div);
					System.out.println(s.length());
					repunit = true;
				}
				j++;
				
			}
		}

	}

}
