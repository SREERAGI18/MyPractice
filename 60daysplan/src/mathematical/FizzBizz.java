package mathematical;
import java.util.*;

public class FizzBizz {
	
	static ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> s = new ArrayList<>();
		
		for(int i=1; i<=A; i++) {
			if(i%3 == 0 && i%5 == 0) {
				s.add("FizzBuzz");
			}else if(i%3 ==0) {
				s.add("Fizz");
			}else if(i%5 == 0) {
				s.add("Buzz");
			}else {
				s.add(String.valueOf(i));
			}
		}
		
		return s;
    }

	public static void main(String[] args) {
		
//		ArrayList<String> s = fizzBuzz(5);
//		
//		Iterator<String> i = s.listIterator();
//		
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
		
		System.out.println('A'-'@');
	}

}
