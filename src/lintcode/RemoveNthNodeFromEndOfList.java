package lintcode;

import datastructure.ListNode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
    	// write your code here
    	if(head == null || n < 0){
    		return null;
    	}
    	ListNode first = head;
		while(first != null && n > 0){
			first = first.next;
			n--;
		}
//		System.out.println(n);
		//多走一次？不是应该少走一次么？
		if( n > 0 ){
			return null;
		}
		ListNode second = new ListNode(0);
		second.next = head;
		ListNode p = second;
		while(first != null){
			first = first.next;
			p = p.next;
		}
		p.next = p.next.next; 
    	
		return second.next; 
        
    }
}
