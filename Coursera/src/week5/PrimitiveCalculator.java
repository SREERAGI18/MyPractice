package week5;

import java.util.*;

public class PrimitiveCalculator {
	
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        int [] minCalc = new int[n+1];
        int [] minInd = new int[n+1];
        minCalc[1] = 0;
        int [] minOP = new int[3];
        
        for(int i=2; i<minCalc.length; i++) {
        	
        	if(i%3 == 0) {
        		minOP[0] = minCalc[i/3]+1;
        	}else minOP[0] = Integer.MAX_VALUE;
        	if(i%2 == 0) {
        		minOP[1] = minCalc[i/2]+1;
        	}else minOP[1] = Integer.MAX_VALUE;
        	minOP[2] = minCalc[i-1]+1;
        	
        	int ind = min(minOP);
        	
        	minCalc[i] = minOP[ind];
        	if(ind == 0) {
        		minInd[i] = i/3;
        	}else if(ind == 1) {
        		minInd[i] = i/2;
        	}else {
        		minInd[i] = i-1;
        	}
        }
        
        sequence.add(n);
        
        for(int i=minInd.length-1; i>=2;) {
        	sequence.add(minInd[i]);
        	i = minInd[i];
        }
        Collections.reverse(sequence);
        return sequence;
    }

    private static int min(int[] minOP) {
		int min = minOP[0];
		int minInd = 0;
		
		for(int i=1; i<minOP.length; i++) {
			if(min > minOP[i]) {
				min = minOP[i];
				minInd = i;
			}
			
		}
		return minInd;
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}