package arrays;
import java.util.*;

public class AddOneToNum {
	
	static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		
		
		if(A.get(A.size()-1) == 9) {
			int i = A.size()-1;
			while(A.get(i) == 9 && i>0) {
				A.set(i, 0);
				i--;
			}
			if(i == 0 && A.get(i) == 9) {
				A.set(i, 0);
				A.add(0, 1);
			}else {
				A.set(i, A.get(i)+1);
			}
		}else {
			A.set(A.size()-1, A.get(A.size()-1)+1);
		}
		
		int j = 0;
		
		while(A.get(j) == 0) {
			j++;
		}
		if(j != 0) {
			j--;
			while(j>-1) {
				A.remove(0);
				j--;
			}
		}else {
			if(A.get(j) == 0) A.remove(0);
		}
		
		
		return A;
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(0);
		num.add(0);
		num.add(4);
		num.add(4);
		num.add(6);
		num.add(0);
		num.add(9);
		num.add(6);
		num.add(5);
		num.add(1);
		
		num = plusOne(num);
		
		Iterator<Integer> i = num.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
