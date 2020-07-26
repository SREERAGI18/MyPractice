package arrays;
import java.util.*;

public class PascalsTriangle {
	
	static ArrayList<ArrayList<Integer>> solve(int A) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		for(int i=0; i<A; i++) {
			res.add(new ArrayList<>());
		}
		res.get(0).add(1);
		
		for(int i=1; i<A; i++) {
			for(int j=0; j<=i; j++) {
				
				int prevLeft;
				if(j>0) {
					prevLeft = res.get(i-1).get(j-1);
				} else {
					prevLeft = 0;
				}
				
				int prev;
				
				if(j<res.get(i-1).size()) {
					prev = res.get(i-1).get(j);
				}else {
					prev = 0;
				}
				
				res.get(i).add(prev+prevLeft);
			}
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> res = solve(5);
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(res.get(i).get(j));
			}
			System.out.println();
		}
		
//		System.out.println(res.get(4).get(2));

	}

}