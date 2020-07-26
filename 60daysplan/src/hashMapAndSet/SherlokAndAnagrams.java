package hashMapAndSet;
import java.util.*;

public class SherlokAndAnagrams {
	
	static int sherlockAndAnagrams(String s) {

		int count =0;
		
		ArrayList<String> subs = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length()+1; j++) {
				subs.add(s.substring(i, j));
			}
		}
		
		for(int i=0; i<subs.size(); i++) {
			for(int j=0; j<i; j++) {
				if(subs.get(i).length() != subs.get(j).length() || i==j) continue;
				else {
					if(isAnagram(subs.get(i), subs.get(j))) count++;
				}
			}
		}
		return count;
    }

	private static boolean isAnagram(String s1, String s2) {
		int arr [] = new int[123];
		boolean isAnagram = true;
		
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		
		for(int i=0; i<a.length; i++) {
			arr[(int)a[i]]++;
		}
		
		for(int i=0; i<a.length; i++) {
			arr[(int)b[i]]--;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != 0) {
				isAnagram = false;
			}
		}
		
		return isAnagram;
	}

	public static void main(String[] args) {
		
		String s = "abcd";
		
//		for(int i=0; i<s.length(); i++) {
//			for(int j=i+1; j<s.length()+1; j++) {
//				System.out.print(s.substring(i, j)+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(sherlockAndAnagrams(s));

	}

}
