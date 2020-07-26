package string;

public class Special {

	public static void main(String[] args) {
		
		String s = "mnonopoo";
		
		for(int i=0; i<s.length(); i++){
            for(int j=s.length(); j>=i+1; j--){
                System.out.print(s.substring(i,j)+" ");
            }
        }

	}

}
