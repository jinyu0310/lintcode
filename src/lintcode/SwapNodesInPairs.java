package lintcode;

import java.util.Stack;

import datastructure.ListNode;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public static ListNode swapPairs(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	Stack<Integer> stack = new Stack<Integer>();
    	ListNode dummy = new ListNode(0);
    	ListNode p = dummy;
    	while(head != null){
    		while(head != null && stack.size() < 2){
    			stack.push(head.val);
    			head = head.next;
    		}
    		while(!stack.empty()){
    			p.next = new ListNode(stack.pop());
    			p = p.next;
    		}
    	}
    	
		return dummy.next;
        // Write your code here
    }
}
