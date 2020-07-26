package binarySearchAndTwoPointer;
import java.util.*;

public class SearchRange {
	
	 static ArrayList<Integer> searchRange(final List<Integer> A, int B) {
	    
		 ArrayList<Integer> q = new ArrayList<>(2);
		 
		 int i=0;
		 int j= A.size()-1;
		 int pI = 0;
		 boolean exist = false;
		 
		 while(i<=j) {
			 int m = i + (j-i)/2;
			 
			 if(A.get(m) < B) {
				 pI = i;
				 i = m+1;
			 }else if(A.get(m) > B) {
				 
				 j = m-1;
			 }else {
				 pI = i;
				 i = m;
				 exist = true;
				 break;
			 }
		 }
		 int pJ = i;
		 
		 if(!exist) {
			 q.add(-1);
			 q.add(-1);
			 return q;
		 }
		 
		 if(i>0) {
			 while(A.get(i-1) == B && pI<=i) {
				 if(A.get(pI) == B) {
					 i = pI;
					 break;
				 }
				 int m = pI + (i-pI)/2;
				 
				 if(A.get(m) < B) {
					 pI = m+1;
					 
				 }else {
					 i = m;
				 }
			 }
		 }
		 
		 
		 if(pJ<A.size()-1) {
			 while(A.get(pJ+1) == B && j>=pJ) {
				 
				 int m = pJ + (int)Math.ceil((j-pJ)/2);
				 if(pJ == A.size()-2) break;
				 
				 if(A.get(m) > B) {
					 j = m-1;
					 if(A.get(j) == B) break;
				 }else {
					 pJ = m;
				 }
			 }
		 }else if(pJ == A.size()-1) j=pJ;
		 
		 if(pJ == A.size()-2 && A.get(pJ+1) == B) {
			 j = pJ+1;
		 }
		 if(A.get(j) != B) j = pJ;
		 
		 q.add(i);
		 q.add(j);
		 
		 return q;
	 }

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ArrayList<Integer> range = searchRange(list,1);
		
		for(int i=0; i<range.size(); i++) {
			System.out.print(range.get(i)+" ");
		}

	}

}
