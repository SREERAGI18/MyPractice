package binarySearchAndTwoPointer;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int left = 0;
        int right = a;
        int s = 0;
        
        while(left<right){
        	if(a == 1) s = a;
            int m = left+(right-left)/2;
            if((right-left)/2 == 0) break;
            
            if((long)m*m <= a){
                if((long)m*m == a) {
                    s = m;
                    break;
                }
                else left = m;
            }else{
                right = m;
            }
        }
        if(s*s != a) s = left;
        
        System.out.println(s);

	}

}
