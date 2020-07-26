package searching;

public class Linear {
	
	static int search(int [] arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int [] arr = {1,4,2,8,10,3,9};
		
		System.out.println(search(arr,11));

	}

}
