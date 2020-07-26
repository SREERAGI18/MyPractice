package bitManipulation;

import java.util.Collections;
import java.util.Scanner;

public class ReverseBits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			
			String s = new String(Integer.toBinaryString(n));
			
			while(s.length() != 32) {
				s = "0"+ s;
			}
			
			String rev = "";
			
			for(int j=s.length()-1; j>=0; j--) {
				rev = rev+s.charAt(j);
			}
			
			System.out.println(Long.parseLong(rev, 2));
		}

	}

}
