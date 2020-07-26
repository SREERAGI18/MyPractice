package arrays;
import java.util.*;

public class WaveArray {
	
	static ArrayList<Integer> wave(ArrayList<Integer> A) {
		if(A.size() == 1) return A;
		
		Collections.sort(A);
		ArrayList<Integer> res = new ArrayList<>();
		int i=1;
		
		for(; i<A.size(); i+=2) {
			res.add(A.get(i));
			res.add(A.get(i-1));
		}
		if(A.size()%2 != 0) {
			res.add(A.get(A.size()-1));
		}
		
		return res;
    }

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String [] in = s.split(", ");
		
		for(int i=0; i<in.length; i++)
		{
			arr.add(Integer.parseInt(in[i]));
		}
		
		arr = wave(arr);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		sc.close();
	}

}
