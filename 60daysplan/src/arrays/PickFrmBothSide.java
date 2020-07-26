package arrays;

import java.util.*;

public class PickFrmBothSide {
	
	static int solve(ArrayList<Integer> A, int B) {
		
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int leftsum = 0;
        int rightsum = 0;
        
        for(int k=0; k<B; k++) {
        	leftsum +=A.get(k);
        	left.add(leftsum);
        }
        
        for(int k=A.size()-1; k>=A.size()-B; k--) {
        	rightsum += A.get(k);
        	right.add(rightsum);
        }
        
        int max = Math.max(left.get(left.size()-1), right.get(right.size()-1));
        int i = 0;
        int j = right.size()-2;
        
        for(int k=0; k<B-1; k++) {
        	int sum = left.get(i)+right.get(j);
        	if(max < sum) max = sum;
        	i++;
        	j--;
        }
        return max;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String in[] = s.split(", ");
		int B = sc.nextInt();
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i=0; i<in.length; i++) {
			A.add(Integer.parseInt(in[i]));
		}
		
		System.out.print(solve(A, B));
	}

}
