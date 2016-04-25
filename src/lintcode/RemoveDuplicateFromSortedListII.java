package lintcode;

import datastructure.ListNode;

public class RemoveDuplicateFromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	
    	ListNode dummy = new ListNode(0); //哑结点
    	ListNode tail = null;
    	int flag = 0;
    	while(head != null){
    		while(head != null && head.next != null && head.val == head.next.val){
    			head = head.next;
    			flag = 1;
    		}
    		if(flag == 1){
    			head = head.next;
    			flag = 0;
    			continue;
    		}
    		if(dummy.next == null){
        		dummy.next = head; //这个才是把dummy.next指向tail；与一等价
        		tail = head;
    		}
    		if(tail.val < head.val){
    			tail.next = head;
    			tail = tail.next;
    		}
    		head = head.next;
    	}
    	if(tail != null){
        	tail.next = null;
    	}
		return dummy.next; 
        // write your code here
    }
}
