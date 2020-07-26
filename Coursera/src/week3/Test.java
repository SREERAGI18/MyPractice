package week3;

public class Test {
	
	static void insertionSort(int [] weights, double [] perUnit, int n) {
		
		for(int i=0; i<n; i++) {
			double tmp = perUnit[i];
			int tmp2 = 0;
			for(int j=i; j<n; j++) {
				
				if(perUnit[j] > tmp) {
					tmp = perUnit[j];
					perUnit[j] = perUnit[i];
					perUnit[i] = tmp;
					
					tmp2 = weights[j];
					weights[j] = weights[i];
					weights[i] = tmp2;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int [] a = {};
		double [] b = {12,11,99};
		
		double res =(double) 500/30;
		System.out.println(res);
	}

}
