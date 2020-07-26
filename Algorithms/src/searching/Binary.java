package searching;

public class Binary {
	
	static int search(int [] arr, int x) {
		int n = arr.length-1;
		 return searchAlgo(arr,0,n, x);
	}

	private static int searchAlgo(int[] arr, int i, int n, int x) {
		
		if(i<=n) {
			int mid = (i+n)/2;
			
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				return searchAlgo(arr,mid+1,n,x);
			}else {
				return searchAlgo(arr,i,mid-1,x);
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8};
		
		System.out.println(search(arr,7));

	}

}
