package binarySearchAndTwoPointer;

import java.util.ArrayList;
import java.util.Iterator;

public class MergeTwoSortedArray {
	static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int i =0;
	    int j=0;
	    
	    while(j<b.size()){
	        if(a.get(i) < b.get(j)){
	            i++;
	        }else{
	            a.add(i,b.get(j));
	            i++;
	            j++;
	        }
	    }
	    i--;
	    j--;
	    if(b.get(j)>a.get(i)) a.add(i,b.get(j));
	}
	
	public static void main(String [] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		a.add(-5);
		b.add(-5);
		
		merge(a,b);
		
		Iterator<Integer> i = a.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
