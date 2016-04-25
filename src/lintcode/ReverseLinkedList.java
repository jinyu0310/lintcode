package lintcode;

import java.util.Stack;

import datastructure.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public static ListNode reverse(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	Stack<Integer> stack = new Stack<Integer>();
    	while(head != null){
    		stack.push(head.val);
    		head = head.next;
    	}
    	ListNode dummy = new ListNode(0);
    	ListNode p = dummy;
    	while(!stack.empty()){
    		p.next = new ListNode(stack.pop());
    		p = p.next;
    	}
    	
		return dummy.next;
        // write your code here
    }
}
