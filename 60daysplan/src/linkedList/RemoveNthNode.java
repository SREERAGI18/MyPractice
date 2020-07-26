package linkedList;

public class RemoveNthNode {
	
	static int size(ListNode A) {
		int count =0;
		
		ListNode temp = A;
		
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	static ListNode removeFirst(ListNode A) {
		
		A = A.next;
		
		return A;
	}
	
	static ListNode removeNthFromEnd(ListNode A, int B) {
		
		int n = size(A);
		
		if(B > n) {
			A = removeFirst(A);
			return A;
		}
		if(B == n) {
			A = removeFirst(A);
			return A;
		}
		if(B == 1) {
			ListNode temp = A;
			
			while(temp.next.next != null) {
				temp = temp.next;
			}
		}
		
		ListNode temp = A;
		
		for(int i=0; i<n-B-1; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		return A;
    }

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		
		
//		removeFirst(head);
		
//		ListNode temp = removeNthFromEnd(head,1);
//		
//		while(temp != null) {
//			System.out.print(temp.val+" ");
//			temp = temp.next;
//		}
		
		int temp = head.val;
		head.val = head.next.val;
		head.next.val = temp;
		
		System.out.println(head.val);

	}

}

class ListNode {
	      public int val;
	      public ListNode next;
	      ListNode(int x) { 
	    	  	val = x; 
	    	  	next = null; 
	    	  }
	 }
