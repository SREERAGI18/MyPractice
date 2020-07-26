package week5;
import java.util.*;

class EditDistance {
	  public static int EditDistance(String s, String t) {
	    char a [] = new char[s.length()+1];
	    char b [] = new char[t.length()+1];
	    
	    for(int i=1; i<a.length-1; i++) {
	    	a[i] = s.charAt(i-1);
	    }
	    a[s.length()] = s.charAt(s.length()-1);
	    
	    for(int i=1; i<b.length-1; i++) {
	    	b[i] = t.charAt(i-1);
	    }
	    b[t.length()] = t.charAt(t.length()-1);
	    
	    return editDistance(a,b);
	  }
	  private static int editDistance(char[] a, char[] b) {
		int d [][] = new int[a.length][b.length];
		
		d[0][0] = 0;
		
		for(int i=1; i<a.length; i++) {
			d[i][0] = i;
		}
		for(int i=1; i<b.length; i++) {
			d[0][i] = i;
		}
		
		for(int j=1; j<b.length; j++) {
			for(int i=1; i<a.length; i++) {
				int insertion = d[i][j-1]+1;
				int deletion = d[i-1][j]+1;
				int match = d[i-1][j-1];
				int mismatch = d[i-1][j-1]+1;
				
				if(a[i] == b[j]) d[i][j] = min(insertion, deletion, match);
				else d[i][j] = min(insertion, deletion, mismatch);
			}
		}
		
		return d[a.length-1][b.length-1];
	  }
	  
	  private static int min(int a, int b, int c) {
		  
		  int min = 0;
		  
		  if(a<b) {
			  if(a<c) min = a;
			  else min =c;
		  }else {
			  if(b<c) min = b;
			  else min =c;
		  }
		return min;
	  }
	public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);
	
	    String s = scan.next();
	    String t = scan.next();
	
	    System.out.println(EditDistance(s, t));
	    
	    scan.close();
	  }

}