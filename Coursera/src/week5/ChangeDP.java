package week5;

import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m, int [] coins) {
        int minNumCoins [] = new int[m+1];
        
        for(int i=0; i<=m; i++) {
        	if(i>2) break;
        	minNumCoins[i] = i;
        }
        
        if(m<3) return m;
        
        for(int i=3; i<m; i++) {
        	minNumCoins[i] = Integer.MAX_VALUE;
        	for(int j=0; j<coins.length; j++) {
        		if(i>=coins[j]) {
        			int NumCoins = minNumCoins[i-coins[j]]+1;
        			if(NumCoins < minNumCoins[i]) {
        				minNumCoins[i] = NumCoins;
        			}
        		}
        	}
        	
        }
        return minNumCoins[m-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int coins [] = {1,3,4};
        System.out.println(getChange(m, coins));

    }
}

