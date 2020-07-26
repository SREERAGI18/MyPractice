package sorting;
import java.util.*;

public class MergeSortOnLL {
	
	static void sort(LinkedList<Integer> ll) {
		
		sortU(ll,0,ll.size()-1);
	}

	private static void sortU(LinkedList<Integer> ll, int start, int end) {
		
		if(start < end) {
//			int n = ll.size();
			int m = (start+end)/2;
			
			LinkedList<Integer> L = new LinkedList<>();
			LinkedList<Integer> R = new LinkedList<>();
			
			for(int i=start; i<m; i++) {
				L.add(ll.get(i));
			}
			for(int i=m; i<=end; i++) {
				R.add(ll.get(i));
			}
			
			sortU(L,start,m-1);
			sortU(R,m,end);
			merge(ll,L,R);
		}
		
	}

	private static void merge(LinkedList<Integer> ll, LinkedList<Integer> l, LinkedList<Integer> r) {
		int n1 = l.size();
		int n2 = r.size();
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2) {
			if(l.get(i) < r.get(j)) {
				ll.remove(k);
				ll.add(l.get(i));
				i++;
			}else {
				ll.remove(k);
				ll.add(r.get(j));
				j++;
			}
			k++;
		}
		if(i<n1) {
			ll.remove(k);
			ll.add(l.get(i));
			i++;
			k++;
		}
		if(j<n2) {
			ll.remove(k);
			ll.add(r.get(j));
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(3);
		ll.add(1);
		ll.add(5);
		ll.add(10);
		ll.add(0);
		
		sort(ll);
		
		Iterator<Integer> i = ll.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
