package binarySearchAndTwoPointer;
import java.util.*;

public class IntersectionOfTwoSortedArrays {
	
	static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		
		ArrayList<Integer> res = new ArrayList<>();
		
		int i=0;
		int j=0;
		
		while(i<A.size() && j<B.size()) {
			if(A.get(i) < B.get(j)) {
				i++;
			}else if(A.get(i) > B.get(j)) {
				j++;
			}else {
				if(A.get(i).equals(B.get(j))) res.add(A.get(i));
				i++;
				j++;
			}
		}
		
		return res;
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		
		A.add(1000);
		
		B.add(1000);
		
		ArrayList<Integer> res = intersect(A,B);
		
		Iterator<Integer> i = res.listIterator();
		
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
//		A.remove(B.get(0));
//		B.remove(0);
//		
		
		
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
		
//		A.remove(A.indexOf(B.get(0)));
//		B.remove(0);
	}

}
