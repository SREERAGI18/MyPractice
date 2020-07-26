package arrays;
import java.util.*;

public class Leaders {
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> leads = new ArrayList<>();
		int max = A.get(A.size()-1);
		leads.add(max);
		
		for(int i=A.size()-2; i>=0; i--) {
			if(A.get(i) > max) {
				max = A.get(i);
				leads.add(max);
			}
		}
		
		return leads;
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> leads = new ArrayList<>();
		leads.add(1);
		
		
	}

}
