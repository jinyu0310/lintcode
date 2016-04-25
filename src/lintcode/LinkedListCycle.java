package lintcode;

import datastructure.ListNode;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public static boolean hasCycle(ListNode head) {
    	if(head == null || head.next == null){
    		return false;
    	}
    	ListNode pfast = head.next;
    	ListNode pslow = head;
    	while(pfast != null && pfast.next != null && pslow != null){
    		if(pfast.val == pslow.val){
    			return true;
    		}
    		pfast = pfast.next.next;
    		pslow = pslow.next;
    	}
    	
		return false;  
        // write your code here
    }
}
