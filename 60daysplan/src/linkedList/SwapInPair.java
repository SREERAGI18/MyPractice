package linkedList;

public class SwapInPair {
	
	static ListNode swapPairs(ListNode A) {
		ListNode temp = A;
		ListNode tail = A.next;
		
		while(tail.next != null) {
			
			int tmp = temp.val;
			temp.val = tail.val;
			tail.val = tmp;
			
			temp = tail.next;
			tail = temp.next;
			if(tail == null) return A;
		}
		
		int tmp = temp.val;
		temp.val = tail.val;
		tail.val = tmp;
		
		return A;
		
    }

	public static void main(String[] args) {

		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		head = swapPairs(head);
		
		ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}

	}

}
