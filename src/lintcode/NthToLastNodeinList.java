package lintcode;

import datastructure.ListNode;

public class NthToLastNodeinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
	 static ListNode nthToLast(ListNode head, int n) {
    	if(n < 0 || head == null){
    		return null;
    	}
    	ListNode first = head;
    	ListNode second = head;
    	while(n > 0){
    		first = first.next;
    		n--;
    	}
    	while(first != null){
    		first = first.next;
    		second = second.next;
    	}
    	
		return second;
        // write your code here
    }

}
