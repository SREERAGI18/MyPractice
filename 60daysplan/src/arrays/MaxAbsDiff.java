package arrays;

import java.util.ArrayList;

public class MaxAbsDiff {
	
	static int maxArr(ArrayList<Integer> A) {
		
//		int max = 0;
//		for(int i=0; i<A.size(); i++) {
//			for(int j=i+1; j<A.size(); j++) {
//				
//				int diff = Math.abs(A.get(i) - A.get(j)) + Math.abs(i-j);
//				if(diff > max) {
//					max = diff;
//					System.out.println(A.get(i)+" "+A.get(j)+" "+i+" "+j);
//				}
//			}
//		}
//		return max;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<A.size(); i++) {
			int temp1 = A.get(i)+i;
			int temp2 = A.get(i)-i;
			
			if(temp1 < min1) min1 = temp1;
			if(temp1 > max1) max1 = temp1;
			if(temp2 < min2) min2 = temp2;
			if(temp2 > max2) max2 = temp2;
		}
		int diff1 = Math.abs(min1-max1);
		int diff2 = Math.abs(min2-max2);
		
		return Math.max(diff1, diff2);
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(55);
		list.add(-8);
		list.add(43);
		list.add(52);
		list.add(8);
		list.add(59);
		list.add(-91);
		list.add(-79);
		list.add(-18);
		list.add(-94);
		
		System.out.println(maxArr(list));

	}

}
