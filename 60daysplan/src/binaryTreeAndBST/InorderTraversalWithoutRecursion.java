package binaryTreeAndBST;
import java.util.*;

public class InorderTraversalWithoutRecursion {
	
	static int[] inorderTraversal(TreeNode A) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        TreeNode temp = A;
        
        while(temp != null || s.size() >0) {
            while(temp != null) {
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            ans.add(temp.val);
            temp = temp.right;
        }
        
        int arr[] = new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
    }
	
	static int[] postorderTraversal(TreeNode A) {
		
		ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
		TreeNode curr = A;
		
//		while(true) {
//			if(curr != null) {
//				s.push(curr);
//				curr = curr.left;
//			}else {
//				if(s.isEmpty()) break;
//				curr = s.peek().right;
//				
//				if(curr == null) {
//					TreeNode last = null;
//					while(!s.isEmpty() && s.peek().right == last) {
//						last = s.peek();
//						s.pop();
//						ans.add(last.val);
//					}
//				}
//			}
//		}
		
		while(!s.isEmpty() || curr != null) {
			while(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			
			curr = s.peek().right;
			TreeNode last = null;
			
			while(!s.isEmpty() && s.peek().right == last) {
				last = s.peek();
				s.pop();
				ans.add(last.val);
			}
			
		}
		
		int arr[] = new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(10);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		int [] arr = postorderTraversal(root);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) {
	      val = x;
	       left=null;
	      right=null;
	     }
	 }
